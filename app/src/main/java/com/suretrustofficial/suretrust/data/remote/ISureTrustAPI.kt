package com.suretrustofficial.suretrust.data.remote

import com.suretrustofficial.suretrust.data.remote.models.CommunityCountResponse
import com.suretrustofficial.suretrust.data.remote.models.CourseResponse
import com.suretrustofficial.suretrust.data.remote.models.DocumentResponse
import com.suretrustofficial.suretrust.data.remote.models.LoginRequestBody
import com.suretrustofficial.suretrust.data.remote.models.LoginResponse
import com.suretrustofficial.suretrust.data.remote.models.NoticeResponse
import com.suretrustofficial.suretrust.data.remote.models.RegisterRequestBody
import com.suretrustofficial.suretrust.data.remote.models.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Query

interface ISureTrustAPI {

    @POST("users/")
    suspend fun registerUser(
        @Body registerRequestBody: RegisterRequestBody
    ): Response<RegisterResponse>

    @POST("users/get-token/")
    suspend fun userLogin(
        @Body loginBody: LoginRequestBody
    ): Response<LoginResponse>

    @GET("home/notice/")
    suspend fun getNotice(): Response<List<NoticeResponse>>

    @GET("community/get_count")
    suspend fun getCommunityCount(): Response<CommunityCountResponse>

    @GET("home/about-suretrust/")
    suspend fun getAboutSureTrust(): Response<List<NoticeResponse>>

    @GET("gallery/documents/")
    suspend fun getDocuments(): Response<DocumentResponse>

    @GET("courses/get_courses_by_param/")
    suspend fun getMedicalCourse(
        @Query("category") category: String = "MEDICAL",
        @Query("page") page: Int
    ): Response<CourseResponse>

    @GET("courses/get_courses_by_param/")
    suspend fun getNonMedicalCourse(
        @Query("category") category: String = "NON MEDICAL",
        @Query("page") page: Int
    ): Response<CourseResponse>
}