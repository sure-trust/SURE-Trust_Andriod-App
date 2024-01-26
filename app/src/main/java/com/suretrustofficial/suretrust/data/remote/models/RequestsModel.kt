package com.suretrustofficial.suretrust.data.remote.models

data class LoginRequestBody(
    val email: String,
    val login_as: String,
    val password: String
)

data class RegisterRequestBody(
    val college_district: String,
    val college_state: String,
    val course_id: String,
    val email: String,
    val gender: String,
    val name: String,
    val password: String,
    val phone: String,
    val qualification: String
)