package com.suretrustapp.suretrust.presentation.internship

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import com.suretrustapp.suretrust.databinding.FragmentInternshipZoneBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import com.suretrustapp.suretrust.presentation.components.InternshipProjectList

class InternshipZoneFragment : BaseFragment() {
    private var _binding: FragmentInternshipZoneBinding? = null
    private val binding: FragmentInternshipZoneBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInternshipZoneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTrendingVideo()

        val list = listOf(
            "Android App Development",
            "Embedded Systems & IOT",
            "AutoCad & Solidworks",
            "VLSI Designing",
            "Data Science and analytics",
            "Microsoft Power BI",
            "Web development",
            "Java",
            "Python"
        )

        binding.composeView.setContent {
            InternshipProjectList(list)
        }
    }


    private fun setTrendingVideo() {
        val videoLink =
            "<html><body style=\"padding: 0; margin: 0; border-radius: 20px;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/YTu-pnGVgJQ?si=NZ2yAY3jQDZ_5CAH\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe></body></html>"
        binding.internshipZonePlayerView.apply {
            loadData(videoLink, "text/html", "utf-8")
            settings.javaScriptEnabled = true
            webChromeClient = WebChromeClient()
        }

    }
}