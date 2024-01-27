package com.suretrustofficial.suretrust.data.remote.models

data class LoginResponse(
    val token: String,
    val user_id: String,
    val regno: String
)

data class RegisterResponse(
    val email: String,
    val id: Long,
    val success: String
)

data class NoticeResponse(
    val id: Int,
    val title: String,
    val description: String
)

data class CommunityCountResponse(
    val Result: CommunityCountBody
)

data class CommunityCountBody(
    val course_count: Int,
    val batch_count: Int,
    val trainer_count: Int
)

data class DocumentResponse(
    val count: Int,
    val next: String?,
    val previous: String,
    val results: List<Document>
)

data class Document(
    val id: Int,
    val title: String,
    val file: String
)