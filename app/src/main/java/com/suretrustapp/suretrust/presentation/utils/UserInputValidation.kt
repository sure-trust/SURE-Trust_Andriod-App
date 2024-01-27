package com.suretrustapp.suretrust.presentation.utils

import com.suretrustapp.suretrust.presentation.components.InputErrorType
import java.util.regex.Pattern

object UserInputValidation {

    const val NAME_REGEX = ""
    const val EMAIL_REGEX = "^(.+)@(\\S+)$"
    const val PHONE_REGEX = ""
    const val PASSWORD_REGEX = "^.{6,}$"


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