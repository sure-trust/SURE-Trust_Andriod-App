package com.suretrustofficial.suretrust.presentation.auth

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustofficial.suretrust.data.remote.models.RegisterRequestBody
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import com.suretrustofficial.suretrust.presentation.components.InputErrorType
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class RegisterViewModel @Inject constructor(
    val repository: RemoteDataRepository
) : ViewModel() {

    val registerScreenUiEvents = Channel<RegisterScreenUiEvents>()

    var name by
        mutableStateOf("")
        private set


    var nameError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var phone by
        mutableStateOf("")
        private set

    var phoneError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var qualification by
        mutableStateOf("")
        private set

    var qualificationError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var email by
        mutableStateOf("")
        private set

    var emailError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var password by
        mutableStateOf("")
        private set

    var passwordError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var collegeName by
        mutableStateOf("")
        private set

    var collegeNameError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var collegePlace by
        mutableStateOf("")
        private set

    var collegePlaceError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var collegeDist by
        mutableStateOf("")
        private set

    var collegeDistError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var collegeState by
        mutableStateOf("")
        private set

    var collegeStateError by
        mutableStateOf(InputErrorType.NO_ERROR)
        private set

    var selectedCourse by
        mutableStateOf("")
        private set

    val genders = listOf("Male", "Female", "Other")

    var selectedGenderOption by  mutableStateOf(genders[0])

    fun onRegisterButtonClicked () {
        viewModelScope.launch {
            repository.registerUser(
                RegisterRequestBody(
                    college_district = collegeDist,
                    college_state = collegeState,
                    course_id = selectedCourse,
                    email = email,
                    gender = selectedGenderOption,
                    password = password,
                    name = name,
                    phone = phone,
                    qualification = qualification,
                )
            ).collectLatest { response->
                when(response){
                    is StandardResponse.Failed -> {

                    }
                    StandardResponse.Loading -> {}
                    is StandardResponse.Success -> {
                        onRegisterScreenUiEvent(RegisterScreenUiEvents.RegisterSuccess)
                    }
                }
            }
        }
    }

    private fun onRegisterScreenUiEvent(event: RegisterScreenUiEvents) {
        viewModelScope.launch {
            registerScreenUiEvents.send(event)
        }
    }

    fun onEmailChange(newValue: String) {
        email = newValue
    }

    fun onPasswordChange(newValue: String) {
        password = newValue
    }

    fun onNameChange(newValue: String) {
        name = newValue
    }

    fun onPhoneChange(newValue: String) {
        phone = newValue
    }

    fun onSelectedGenderOptionChange(newValue: String) {
        selectedGenderOption = newValue
    }

    fun onQualificationChange(newValue: String) {
        qualification = newValue
    }

    fun onCollegeNameChange(newValue: String) {
        collegeName = newValue
    }

    fun onCollegePlaceChange(newValue: String) {
        collegePlace = newValue
    }

    fun onCollegeDistChange(newValue: String) {
        collegeDist = newValue
    }

    fun onCollegeStateChange(newValue: String) {
        collegeState = newValue
    }

    fun onCourseChange(newValue: String) {
        selectedCourse = newValue
    }
}

sealed interface RegisterScreenUiEvents {
    data object RegisterSuccess : RegisterScreenUiEvents
    data class ShowToast(val message: String): RegisterScreenUiEvents
}