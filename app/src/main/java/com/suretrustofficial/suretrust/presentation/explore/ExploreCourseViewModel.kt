package com.suretrustofficial.suretrust.presentation.explore

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustofficial.suretrust.data.remote.models.CourseItem
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ExploreCourseViewModel @Inject constructor(
    private val repo: RemoteDataRepository
) : ViewModel() {

    //TODO: USE MAPPER TO POPULATE THE UI STATE else the ui layer will access data layer

    private val _medCourseState = MutableStateFlow<List<CourseItem>>(emptyList())
    val medCourseState: StateFlow<List<CourseItem>> get() = _medCourseState.asStateFlow()

    private val _nonMedCourseState = MutableStateFlow<List<CourseItem>>(emptyList())
    val nonMedCourseState: StateFlow<List<CourseItem>> get() = _nonMedCourseState.asStateFlow()

    init {
        getMedCourseByPage()
        getNonMedCourseByPage()
    }

    fun getMedCourseByPage(page: Int = 1) {
        viewModelScope.launch {
            repo.getMedicalCourseByPage(page).collectLatest {
                when (it) {
                    is StandardResponse.Success -> {
                        _medCourseState.value = it.data.results
                    }

                    is StandardResponse.Failed -> {}
                    StandardResponse.Loading -> {}
                }
            }
        }
    }

    fun getNonMedCourseByPage(page: Int = 1) {
        viewModelScope.launch {
            repo.getNonMedicalCourseByPage(page).collectLatest {
                when (it) {
                    is StandardResponse.Success -> {
                        _nonMedCourseState.value = it.data.results
                    }

                    is StandardResponse.Failed -> {}
                    StandardResponse.Loading -> {}
                }
            }
        }
    }

}