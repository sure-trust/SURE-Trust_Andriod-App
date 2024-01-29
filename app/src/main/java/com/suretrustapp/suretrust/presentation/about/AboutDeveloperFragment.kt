package com.suretrustapp.suretrust.presentation.about

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suretrustapp.suretrust.databinding.FragmentAboutDeveloperBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AboutDeveloperFragment : BaseFragment() {
    private var _binding: FragmentAboutDeveloperBinding? = null
    private val binding: FragmentAboutDeveloperBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAboutDeveloperBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.linkedinBtn.setOnClickListener {
            openWebBrowser("https://www.linkedin.com/in/subhadipdhn/")
        }

        binding.gmailBtn.setOnClickListener {
            openWebBrowser("mailto:subhadipdhn@gmail.com")
        }

        binding.githubBtn.setOnClickListener {
            openWebBrowser("https://github.com/Subhadiptech")
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}