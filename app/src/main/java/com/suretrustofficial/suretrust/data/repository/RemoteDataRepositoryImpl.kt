package com.suretrustofficial.suretrust.data.repository

import com.suretrustofficial.suretrust.data.mappers.toNewsAndUpdatesDTO
import com.suretrustofficial.suretrust.data.remote.ISureTrustAPI
import com.suretrustofficial.suretrust.data.remote.models.CommunityCountResponse
import com.suretrustofficial.suretrust.data.remote.models.CourseResponse
import com.suretrustofficial.suretrust.data.remote.models.DocumentResponse
import com.suretrustofficial.suretrust.data.remote.models.LoginRequestBody
import com.suretrustofficial.suretrust.data.remote.models.LoginResponse
import com.suretrustofficial.suretrust.data.remote.models.NoticeResponse
import com.suretrustofficial.suretrust.data.remote.models.RegisterRequestBody
import com.suretrustofficial.suretrust.data.remote.models.RegisterResponse
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.models.UpdatesAndNewsDTO
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class RemoteDataRepositoryImpl @Inject constructor(
    private val api: ISureTrustAPI
) : BaseRemoteDataRepository(), RemoteDataRepository {

    override suspend fun registerUser(registerRequestBody: RegisterRequestBody): Flow<StandardResponse<RegisterResponse>> =
        flow {
            emit(StandardResponse.Loading)
            safeAPICall(apiCall = {
                emit(retryIO {
                    val resp = api.registerUser(registerRequestBody)
                    if (resp.isSuccessful && resp.body() != null) {
                        StandardResponse.Success(resp.body()!!)
                    } else {
                        StandardResponse.Failed("Something went wrong")
                    }
                })
            }, errorHandler = {
                emit(
                    StandardResponse.Failed(
                        it.message ?: "Something went Wrong"
                    )
                )
            })
        }.flowOn(Dispatchers.IO)

    override suspend fun userLogin(loginBody: LoginRequestBody): Flow<StandardResponse<LoginResponse>> =
        flow {
            emit(StandardResponse.Loading)
            safeAPICall(apiCall = {
                emit(retryIO {
                    val resp = api.userLogin(loginBody)
                    if (resp.isSuccessful && resp.body() != null) {
                        StandardResponse.Success(resp.body()!!)
                    } else {
                        StandardResponse.Failed("Something went wrong")
                    }
                })
            }, errorHandler = {
                emit(
                    StandardResponse.Failed(
                        it.message ?: "Something went Wrong"
                    )
                )
            })
        }.flowOn(Dispatchers.IO)

    override suspend fun getNotice(): Flow<StandardResponse<List<UpdatesAndNewsDTO>>> = flow {
        emit(StandardResponse.Loading)
        safeAPICall(apiCall = {
            emit(retryIO {
                val resp = api.getNotice()
                if (resp.isSuccessful && resp.body() != null) {
                    StandardResponse.Success(resp.body()!!.map { it.toNewsAndUpdatesDTO() })
                } else {
                    StandardResponse.Failed("Something went wrong")
                }
            })
        },
            errorHandler = { emit(StandardResponse.Failed(it.message ?: "Something went Wrong")) })
    }.flowOn(Dispatchers.IO)


    override suspend fun getCommunityCount(): Flow<StandardResponse<CommunityCountResponse>> =
        flow {
            emit(StandardResponse.Loading)
            safeAPICall(apiCall = {
                emit(retryIO {
                    val resp = api.getCommunityCount()
                    if (resp.isSuccessful && resp.body() != null) {
                        StandardResponse.Success(resp.body()!!)
                    } else {
                        StandardResponse.Failed("Something went wrong")
                    }
                })
            }, errorHandler = {
                emit(
                    StandardResponse.Failed(
                        it.message ?: "Something went Wrong"
                    )
                )
            })
        }.flowOn(Dispatchers.IO)

    override suspend fun getAboutSureTrust(loginBody: LoginRequestBody): Flow<StandardResponse<List<NoticeResponse>>> =
        flow {
            emit(StandardResponse.Loading)
            safeAPICall(apiCall = {
                emit(retryIO {
                    val resp = api.getAboutSureTrust()
                    if (resp.isSuccessful && resp.body() != null) {
                        StandardResponse.Success(resp.body()!!)
                    } else {
                        StandardResponse.Failed("Something went wrong")
                    }
                })
            }, errorHandler = {
                emit(
                    StandardResponse.Failed(
                        it.message ?: "Something went Wrong"
                    )
                )
            })
        }.flowOn(Dispatchers.IO)

    override suspend fun getDocuments(): Flow<StandardResponse<DocumentResponse>> =
        flow {
            emit(StandardResponse.Loading)
            safeAPICall(apiCall = {
                emit(retryIO {
                    val resp = api.getDocuments()
                    if (resp.isSuccessful && resp.body() != null) {
                        StandardResponse.Success(resp.body()!!)
                    } else {
                        StandardResponse.Failed("Something went wrong")
                    }
                })
            }, errorHandler = {
                emit(
                    StandardResponse.Failed(
                        it.message ?: "Something went Wrong"
                    )
                )
            })
        }.flowOn(Dispatchers.IO)

    override suspend fun getMedicalCourseByPage(page: Int): Flow<StandardResponse<CourseResponse>> =
        flow {
            emit(StandardResponse.Loading)
            safeAPICall(apiCall = {
                emit(retryIO {
                    val resp = api.getMedicalCourse(page = page)
                    if (resp.isSuccessful && resp.body() != null) {
                        StandardResponse.Success(resp.body()!!)
                    } else {
                        StandardResponse.Failed("Something went wrong")
                    }
                })
            }, errorHandler = {
                emit(
                    StandardResponse.Failed(
                        it.message ?: "Something went Wrong"
                    )
                )
            })

        }.flowOn(Dispatchers.IO)

    override suspend fun getNonMedicalCourseByPage(page: Int): Flow<StandardResponse<CourseResponse>> =
        flow {
            emit(StandardResponse.Loading)
            safeAPICall(apiCall = {
                emit(retryIO {
                    val resp = api.getNonMedicalCourse(page = page)
                    if (resp.isSuccessful && resp.body() != null) {
                        StandardResponse.Success(resp.body()!!)
                    } else {
                        StandardResponse.Failed("Something went wrong")
                    }
                })
            }, errorHandler = {
                emit(
                    StandardResponse.Failed(
                        it.message ?: "Something went Wrong"
                    )
                )
            })

        }.flowOn(Dispatchers.IO)
}