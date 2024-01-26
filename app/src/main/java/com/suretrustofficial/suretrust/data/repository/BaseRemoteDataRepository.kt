package com.suretrustofficial.suretrust.data.repository

import com.suretrustofficial.suretrust.domain.StandardResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext

abstract class BaseRemoteDataRepository {

    suspend fun <T> retryIO(
        times: Int = 3,
        initialDelayMillis: Long = 100,
        maxDelayMillis: Long = 1000,
        factor: Double = 2.0,
        block: suspend () -> T
    ): T = retry(times, initialDelayMillis, maxDelayMillis, factor) {
        withContext(Dispatchers.IO) {
            block()
        }
    }


    private suspend fun <T> retry(
        times: Int,
        initialDelayMillis: Long,
        maxDelayMillis: Long,
        factor: Double,
        block: suspend () -> T
    ): T {
        var currentDelay = initialDelayMillis
        repeat(times - 1) {
            try {
                return block()
            } catch (e: Exception) {
                delay(currentDelay)
                currentDelay =
                    (currentDelay * factor).coerceAtMost(maxDelayMillis.toDouble()).toLong()
            }
        }
        return block()
    }

    suspend fun <T> safeAPICall(
        apiCall: suspend () -> T
    ): StandardResponse<T> {
        return withContext(Dispatchers.IO) {
            try {
                StandardResponse.Success(apiCall.invoke())
            } catch (e: Exception) {
                StandardResponse.Failed(e.message.toString())
            }
        }
    }
}