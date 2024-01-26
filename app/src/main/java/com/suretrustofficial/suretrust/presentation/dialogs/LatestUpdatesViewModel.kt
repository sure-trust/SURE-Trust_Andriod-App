package com.suretrustofficial.suretrust.presentation.dialogs

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.models.UpdatesAndNewsDTO
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class LatestUpdatesViewModel @Inject constructor(
    private val repo: RemoteDataRepository
) : ViewModel() {
    private val _newsData =
        MutableStateFlow<StandardResponse<List<UpdatesAndNewsDTO>>>(StandardResponse.Loading)
    val newsData: Flow<StandardResponse<List<UpdatesAndNewsDTO>>> get() = _newsData.asStateFlow()

    init {
        getNewsUpdates()
    }

    private fun getNewsUpdates() {
        viewModelScope.launch {
            repo.getNotice().collectLatest {
                _newsData.value = it
            }
        }
    }
}