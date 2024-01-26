package com.suretrustofficial.suretrust.presentation.explore

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.suretrustofficial.suretrust.databinding.FragmentExploreCourseBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseFragment
import com.suretrustofficial.suretrust.presentation.components.ExploreCourseScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ExploreCourseFragment : BaseFragment() {
    private var _binding: FragmentExploreCourseBinding? = null
    private val binding: FragmentExploreCourseBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentExploreCourseBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            ExploreCourseScreen()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}