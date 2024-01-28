package com.suretrustapp.suretrust.presentation.explore

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustapp.suretrust.data.remote.models.CourseItem
import com.suretrustapp.suretrust.domain.StandardResponse
import com.suretrustapp.suretrust.domain.repository.RemoteDataRepository
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
    private val medList = mutableStateListOf<CourseItem>()
    private val nonMedList = mutableStateListOf<CourseItem>()
    private val _medCourseState = MutableStateFlow<List<CourseItem>>(emptyList())
    val medCourseState: StateFlow<List<CourseItem>> get() = _medCourseState.asStateFlow()

    private val _nonMedCourseState = MutableStateFlow<List<CourseItem>>(emptyList())
    val nonMedCourseState: StateFlow<List<CourseItem>> get() = _nonMedCourseState.asStateFlow()

    private val _nextState = MutableStateFlow<String?>(null)
    val nextState: StateFlow<String?> = _nextState.asStateFlow()

    init {
        getMedCourseByPage()
        getNonMedCourseByPage()
    }

    fun getMedCourseByPage(page: Int = 1) {
        viewModelScope.launch {
            repo.getMedicalCourseByPage(page).collectLatest {
                when (it) {
                    is StandardResponse.Success -> {
                        medList.addAll(it.data.results)
                        _medCourseState.value = medList.distinctBy { data -> data.id }
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
                        nonMedList.addAll(it.data.results)
                        _nonMedCourseState.value = nonMedList.distinctBy { data -> data.id }
                        _nextState.value = it.data.next
                    }

                    is StandardResponse.Failed -> {}
                    StandardResponse.Loading -> {}
                }
            }
        }
    }
}