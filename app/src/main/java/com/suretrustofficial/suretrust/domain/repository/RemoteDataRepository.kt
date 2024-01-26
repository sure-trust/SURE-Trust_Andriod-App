package com.suretrustofficial.suretrust.domain.repository

import com.suretrustofficial.suretrust.data.remote.models.CommunityCountResponse
import com.suretrustofficial.suretrust.data.remote.models.LoginRequestBody
import com.suretrustofficial.suretrust.data.remote.models.LoginResponse
import com.suretrustofficial.suretrust.data.remote.models.NoticeResponse
import com.suretrustofficial.suretrust.data.remote.models.RegisterRequestBody
import com.suretrustofficial.suretrust.data.remote.models.RegisterResponse
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.models.UpdatesAndNewsDTO
import kotlinx.coroutines.flow.Flow

interface RemoteDataRepository {
    suspend fun registerUser(registerRequestBody: RegisterRequestBody): Flow<StandardResponse<RegisterResponse>>
    suspend fun userLogin(loginBody: LoginRequestBody): Flow<StandardResponse<LoginResponse>>
    suspend fun getNotice(): Flow<StandardResponse<List<UpdatesAndNewsDTO>>>
    suspend fun getCommunityCount(): Flow<StandardResponse<CommunityCountResponse>>
    suspend fun getAboutSureTrust(loginBody: LoginRequestBody): Flow<StandardResponse<List<NoticeResponse>>>
}