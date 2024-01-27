package com.suretrustapp.suretrust.presentation.document

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.suretrustapp.suretrust.data.remote.models.Document
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
class DocumentsViewModel @Inject constructor(
    private val repo: RemoteDataRepository
) : ViewModel() {
    private val _documentsState = MutableStateFlow<List<Document>>(emptyList())
    val documentsState: StateFlow<List<Document>> get() = _documentsState.asStateFlow()

    init {
        getDocuments()
    }

    private fun getDocuments() {
        viewModelScope.launch {
            repo.getDocuments().collectLatest {
                when (it) {
                    is StandardResponse.Success -> {
                        _documentsState.value = it.data.results
                    }
                    is StandardResponse.Failed -> {}
                    StandardResponse.Loading -> {}
                }
            }
        }
    }
}