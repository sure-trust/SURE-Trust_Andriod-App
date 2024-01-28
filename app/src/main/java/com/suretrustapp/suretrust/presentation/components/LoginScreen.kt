package com.suretrustapp.suretrust.presentation.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Divider
import androidx.compose.material.RadioButton
import androidx.compose.material.RadioButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.suretrustapp.suretrust.presentation.auth.LoginScreenUiEvents
import com.suretrustapp.suretrust.presentation.auth.LoginViewModel
import com.suretrustapp.suretrust.presentation.compose_config.LecendDeca
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryBackground
import com.suretrustapp.suretrust.presentation.compose_config.PrimaryBlue
import com.suretrustapp.suretrust.presentation.compose_config.White
import com.suretrustapp.suretrust.presentation.utils.showToast
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.flow.receiveAsFlow

@Composable
fun LoginScreen(
    onSuccess: (email: String, password: String) -> Unit,
    navigateToRegister: () -> Unit,
    onForgotPasswordClicked: () -> Unit,
    loginViewModel: LoginViewModel = hiltViewModel(),
) {
    //todo:
    val options = listOf("Student", "Teacher")

    val context = LocalContext.current

    LaunchedEffect(key1 = Unit) {
        loginViewModel.loginScreenUiEvents.receiveAsFlow().collectLatest { event ->
            when (event) {
                is LoginScreenUiEvents.LoginSuccess -> {
                    onSuccess(event.email, event.password)
                }

                is LoginScreenUiEvents.ShowToast -> {
                    context.showToast(event.message)
                }
            }
        }
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(PrimaryBackground)
            .padding(horizontal = 16.dp)
    ) {
        Spacer(modifier = Modifier.height(48.dp))
        Text(
            text = "Account Details",
            fontSize = 24.sp,
            color = White,
            fontFamily = LecendDeca
        )
        Spacer(modifier = Modifier.height(18.dp))
        ThemedTextField(
            fieldLabel = "Email",
            value = loginViewModel.email,
            onValueChange = loginViewModel::onEmailChange,
            error = loginViewModel.emailError,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Email)
        )
        Spacer(modifier = Modifier.height(16.dp))
        ThemedTextField(
            fieldLabel = "Password",
            value = loginViewModel.password,
            onValueChange = loginViewModel::onPasswordChange,
            error = loginViewModel.passwordError,
            keyboardOptions = KeyboardOptions.Default.copy(keyboardType = KeyboardType.Password)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(modifier = Modifier.fillMaxWidth()) {
            options.forEach { option ->
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = (option == loginViewModel.loginAs),
                        onClick = { loginViewModel.onLoginAsChange(option) },
                        colors = RadioButtonDefaults.colors(
                            selectedColor = PrimaryBlue,
                            unselectedColor = White.copy(0.6f)
                        )
                    )
                    Text(
                        text = option,
                        fontSize = 12.sp,
                        color = White.copy(0.6f),
                        fontFamily = LecendDeca
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(36.dp))
        Button(
            onClick = loginViewModel::onRegisterButtonClicked,
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(backgroundColor = PrimaryBlue)
        ) {
            Text(
                text = "Login",
                fontSize = 16.sp,
                color = Color.Black,
                fontFamily = LecendDeca
            )
        }
        Spacer(modifier = Modifier.height(16.dp))
        Divider(
            modifier = Modifier
                .height(0.5.dp)
                .background(Color.Gray)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            Text(
                text = "Register?",
                fontSize = 12.sp,
                color = White,
                fontFamily = LecendDeca,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        navigateToRegister()
                    }
            )

            Spacer(modifier = Modifier.width(16.dp))

            Text(
                text = "Forgot password",
                fontSize = 12.sp,
                color = White,
                fontFamily = LecendDeca,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .weight(1f)
                    .clickable {
                        onForgotPasswordClicked()
                    }
            )
        }
    }
}