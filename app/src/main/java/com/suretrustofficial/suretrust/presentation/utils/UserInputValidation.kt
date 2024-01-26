package com.suretrustofficial.suretrust.presentation.utils

import com.suretrustofficial.suretrust.presentation.components.InputErrorType
import java.util.regex.Pattern

object UserInputValidation {
    //todo:REGEX
    const val NAME_REGEX = ""
    const val EMAIL_REGEX = ""
    const val PHONE_REGEX = ""
    const val PASSWORD_REGEX = ""


    fun validateField(field: String, regex: String): InputErrorType {
        if (field.isNotEmpty()) {
            if (Pattern.compile(regex).matcher(field).matches()) {
                return InputErrorType.NO_ERROR
            } else {
                return InputErrorType.INVALID
            }
        }
        return InputErrorType.EMPTY
    }
}