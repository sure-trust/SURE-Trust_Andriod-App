package com.suretrustofficial.suretrust.presentation.document

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustofficial.suretrust.domain.StandardResponse
import com.suretrustofficial.suretrust.domain.repository.RemoteDataRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DocumentsViewModel @Inject constructor(
    private val repo: RemoteDataRepository
) : ViewModel() {

    init {
        viewModelScope.launch {
            getDocuments()
        }
    }

    private suspend fun getDocuments() {
        repo.getDocuments().collectLatest {
            when(it) {
                is StandardResponse.Success -> {}
                is StandardResponse.Failed -> {}
                StandardResponse.Loading -> {}
            }
        }
    }

    fun kuchBhiKaro() {
        //Lol
    }
}