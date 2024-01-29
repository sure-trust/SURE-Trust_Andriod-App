package com.suretrustapp.suretrust.presentation.home

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustapp.suretrust.data.local.PreferenceHelper
import com.suretrustapp.suretrust.data.local.PreferenceTypeConvertor
import com.suretrustapp.suretrust.data.remote.models.CourseItem
import com.suretrustapp.suretrust.domain.StandardResponse
import com.suretrustapp.suretrust.domain.repository.RemoteDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
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
) : ViewModel() {

    private val medList = mutableStateListOf<CourseItem>()
    private val nonMedList = mutableStateListOf<CourseItem>()

    private val _communityCountLiveData = MutableLiveData<CommunityCount>()
    val communityCountLiveData: LiveData<CommunityCount> = _communityCountLiveData

    private val _nextNonMedState = MutableStateFlow<String?>(null)
    private val _nextMedState = MutableStateFlow<String?>(null)

    init {
        getCommunityCount()

        for (i in 1..100) {
            getMedCourseByPage(page = i)
        }

        for (i in 1..100) {
            getNonMedCourseByPage(page = i)
        }
    }

    private fun getCommunityCount() {
        viewModelScope.launch {
            repo.getCommunityCount().collectLatest { response ->
                when (response) {
                    is StandardResponse.Failed -> {}
                    StandardResponse.Loading -> {}
                    is StandardResponse.Success -> {
                        val result = response.data.Result
                        _communityCountLiveData.value = CommunityCount(
                            courseCount = result.course_count,
                            batchCount = result.batch_count,
                            trainerCount = result.trainer_count,
                        )
                    }
                }
            }
        }
    }

    private fun getMedCourseByPage(page: Int = 1) {
        viewModelScope.launch {
            repo.getMedicalCourseByPage(page).collectLatest {
                when (it) {
                    is StandardResponse.Success -> {
                        _nextMedState.value = it.data.next
                        medList.addAll(it.data.results)
                        PreferenceHelper.localMedCourseList =
                            PreferenceTypeConvertor.courseToStringList(medList.distinctBy { data -> data.id })
                    }

                    is StandardResponse.Failed -> {}
                    StandardResponse.Loading -> {}
                }
            }
        }
    }

    private fun getNonMedCourseByPage(page: Int = 1) {
        viewModelScope.launch {
            repo.getNonMedicalCourseByPage(page).collectLatest {
                when (it) {
                    is StandardResponse.Success -> {
                        _nextNonMedState.value = it.data.next
                        nonMedList.addAll(it.data.results)
                        PreferenceHelper.localNonMedCourseList =
                            PreferenceTypeConvertor.courseToStringList(nonMedList.distinctBy { data -> data.id })
                    }

                    is StandardResponse.Failed -> {}
                    StandardResponse.Loading -> {}
                }
            }
        }
    }
}