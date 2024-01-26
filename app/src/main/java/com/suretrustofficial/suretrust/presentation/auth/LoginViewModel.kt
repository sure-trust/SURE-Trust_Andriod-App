package com.suretrustofficial.suretrust.presentation.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustofficial.suretrust.data.local.PreferenceHelper
import com.suretrustofficial.suretrust.data.remote.models.LoginRequestBody
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import com.suretrustofficial.suretrust.presentation.components.InputErrorType
import com.suretrustofficial.suretrust.presentation.utils.UserInputValidation
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor(
    val repository: RemoteDataRepository
) : ViewModel() {
    var email by mutableStateOf("")
        private set
    var password by mutableStateOf("")
        private set

    var emailError by mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var passwordError by mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var loginAs by mutableStateOf("")
        private set

    val loginScreenUiEvents = Channel<LoginScreenUiEvents>()

    fun onRegisterButtonClicked() {
        emailError =
            UserInputValidation.validateField(email, UserInputValidation.EMAIL_REGEX)
        passwordError =
            UserInputValidation.validateField(password, UserInputValidation.PASSWORD_REGEX)

        if (!(emailError == InputErrorType.NO_ERROR && passwordError == InputErrorType.NO_ERROR)) {
            return
        }

        viewModelScope.launch {
            repository.userLogin(
                LoginRequestBody(
                    email = email,
                    login_as = loginAs,
                    password = password,
                )
            ).collectLatest { response ->
                when (response) {
                    is StandardResponse.Failed -> {
                        email = ""
                        password = ""
                        onLoginScreenEvent(LoginScreenUiEvents.ShowToast("something went wrong"))
                    }

                    StandardResponse.Loading -> {

                    }

                    is StandardResponse.Success -> {
                        val token = response.data.token
                        PreferenceHelper.authToken = token
                        onLoginScreenEvent(
                            LoginScreenUiEvents.LoginSuccess(
                                email = email,
                                password = password,
                            )
                        )
                    }
                }
            }
        }
    }

    fun onEmailChange(newValue: String) {
        email = newValue
    }

    fun onPasswordChange(newValue: String) {
        password = newValue
    }

    fun onLoginAsChange(newValue: String) {
        loginAs = newValue
    }


    private fun onLoginScreenEvent(event: LoginScreenUiEvents) {
        viewModelScope.launch {
            loginScreenUiEvents.send(event)
        }
    }
}

sealed interface LoginScreenUiEvents {
    data class LoginSuccess(val email: String, val password: String) : LoginScreenUiEvents
    data class ShowToast(val message: String): LoginScreenUiEvents
}