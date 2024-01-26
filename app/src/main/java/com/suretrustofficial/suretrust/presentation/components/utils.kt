package com.suretrustofficial.suretrust.presentation.components

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.suretrustofficial.suretrust.presentation.compose_config.LecendDeca
import com.suretrustofficial.suretrust.presentation.compose_config.White


@Composable
fun ThemedTextField(
    fieldLabel: String,
    value: String,
    onValueChange: (String) -> Unit,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    error: InputErrorType = InputErrorType.NO_ERROR
) {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(
            text = fieldLabel,
            fontSize = 12.sp,
            color = White.copy(0.6f),
            fontFamily = LecendDeca
        )
        Spacer(modifier = Modifier.height(8.dp))
        BasicTextField(
            value = value,
            onValueChange = onValueChange,
            textStyle = TextStyle(
                color = White,
                fontSize = 14.sp,
                fontFamily = LecendDeca
            ),
            keyboardOptions = keyboardOptions,
            cursorBrush = Brush.linearGradient(colors = listOf(White)),
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.Transparent)
                .clip(RoundedCornerShape(8.dp))
                .border(width = 1.dp, color = White.copy(0.6f), shape = RoundedCornerShape(8.dp))
                .padding(vertical = 12.dp, horizontal = 6.dp)
        )
        AnimatedVisibility(
            visible = error != InputErrorType.NO_ERROR,
            enter = fadeIn(),
            exit = fadeOut()
        ) {
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = if (error == InputErrorType.EMPTY) "$fieldLabel cannot be empty" else if (error == InputErrorType.INVALID) "$fieldLabel is invalid!" else "",
                fontSize = 8.sp,
                color = Color(0xffEF0000),
                fontFamily = LecendDeca
            )
        }
    }
}

enum class InputErrorType {
    NO_ERROR, EMPTY, INVALID
}