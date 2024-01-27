package com.suretrustapp.suretrust.presentation.document

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suretrustapp.suretrust.databinding.FragmentDocumentsBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import com.suretrustapp.suretrust.presentation.components.DocumentScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class DocumentsFragment : BaseFragment() {
    private var _binding: FragmentDocumentsBinding? = null
    private val binding: FragmentDocumentsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentDocumentsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            DocumentScreen()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}