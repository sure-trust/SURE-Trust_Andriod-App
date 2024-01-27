package com.suretrustofficial.suretrust.presentation.document

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.suretrustofficial.suretrust.databinding.FragmentDocumentsBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseFragment
import com.suretrustofficial.suretrust.presentation.components.DocumentScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DocumentsFragment : BaseFragment() {
    private var _binding: FragmentDocumentsBinding? = null
    private val binding: FragmentDocumentsBinding get() = _binding!!
    private val documentsViewModel: DocumentsViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDocumentsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            DocumentScreen()
        }
        documentsViewModel.kuchBhiKaro()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}