package com.suretrustofficial.suretrust.presentation.home

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

data class CommunityCount(
    val courseCount: Int = 100,
    val batchCount: Int = 100,
    val trainerCount: Int = 100,
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val repo: RemoteDataRepository,
): ViewModel() {
    private val _communityCountLiveData = MutableLiveData<CommunityCount>()
    val communityCountLiveData: LiveData<CommunityCount> = _communityCountLiveData

    init {
        viewModelScope.launch {
            getCommunityCount()
        }
    }

    private suspend fun getCommunityCount() {
        repo.getCommunityCount().collectLatest { response->
        Log.d(TAG, "getCommunityCount: inside function $response")
            when (response) {
                is StandardResponse.Failed -> {

                }
                StandardResponse.Loading -> { }
                is StandardResponse.Success -> {
                    val result = response.data.Result
                    Log.d(TAG, "getCommunityCount: $result")
                    _communityCountLiveData.value = CommunityCount(
                        courseCount = result.course_count,
                        batchCount = result.batch_count,
                        trainerCount = result.trainer_count,
                    )
                }
            }
        }
    }
    companion object {
        const val TAG = "homeviewmodel"
    }
}