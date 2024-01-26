package com.suretrustofficial.suretrust.data.remote

import com.suretrustofficial.suretrust.data.remote.models.CommunityCountResponse
import com.suretrustofficial.suretrust.data.remote.models.LoginRequestBody
import com.suretrustofficial.suretrust.data.remote.models.LoginResponse
import com.suretrustofficial.suretrust.data.remote.models.NoticeResponse
import com.suretrustofficial.suretrust.data.remote.models.RegisterRequestBody
import com.suretrustofficial.suretrust.data.remote.models.RegisterResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

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
}