package com.suretrustapp.suretrust.domain.repository

import com.suretrustapp.suretrust.data.remote.models.CommunityCountResponse
import com.suretrustapp.suretrust.data.remote.models.CourseResponse
import com.suretrustapp.suretrust.data.remote.models.DocumentResponse
import com.suretrustapp.suretrust.data.remote.models.LoginRequestBody
import com.suretrustapp.suretrust.data.remote.models.LoginResponse
import com.suretrustapp.suretrust.data.remote.models.NoticeResponse
import com.suretrustapp.suretrust.data.remote.models.RegisterRequestBody
import com.suretrustapp.suretrust.data.remote.models.RegisterResponse
import com.suretrustapp.suretrust.domain.StandardResponse
import com.suretrustapp.suretrust.domain.models.UpdatesAndNewsDTO
import kotlinx.coroutines.flow.Flow

interface RemoteDataRepository {
    suspend fun registerUser(registerRequestBody: RegisterRequestBody): Flow<StandardResponse<RegisterResponse>>
    suspend fun userLogin(loginBody: LoginRequestBody): Flow<StandardResponse<LoginResponse>>
    suspend fun getNotice(): Flow<StandardResponse<List<UpdatesAndNewsDTO>>>
    suspend fun getCommunityCount(): Flow<StandardResponse<CommunityCountResponse>>
    suspend fun getAboutSureTrust(loginBody: LoginRequestBody): Flow<StandardResponse<List<NoticeResponse>>>
    suspend fun getDocuments(): Flow<StandardResponse<DocumentResponse>>
    suspend fun getMedicalCourseByPage(page: Int): Flow<StandardResponse<CourseResponse>>
    suspend fun getNonMedicalCourseByPage(page: Int): Flow<StandardResponse<CourseResponse>>
}