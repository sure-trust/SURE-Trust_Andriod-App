package com.suretrustofficial.suretrust.presentation.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.suretrustofficial.suretrust.databinding.FragmentAboutBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseFragment
import com.suretrustofficial.suretrust.presentation.components.AboutSectionMembersListScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutFragment : BaseFragment() {
    private var _binding: FragmentAboutBinding? = null
    private val binding: FragmentAboutBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            AboutSectionMembersListScreen()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}