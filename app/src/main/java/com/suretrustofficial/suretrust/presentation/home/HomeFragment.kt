package com.suretrustofficial.suretrust.presentation.home

import android.animation.ValueAnimator
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.suretrustofficial.suretrust.R
import com.suretrustofficial.suretrust.databinding.FragmentHomeBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseFragment
import com.suretrustofficial.suretrust.presentation.dialogs.LatestUpdatesDialogFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeFragment : BaseFragment() {
    private var _binding: FragmentHomeBinding? = null
    private val binding: FragmentHomeBinding get() = _binding!!
    val homeViewModel: HomeViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setTrendingVideo()

        setTextForCards()
        setNewsFlow()
        binding.setFooterListeners()

        homeViewModel.communityCountLiveData.observe(
            viewLifecycleOwner
        ) {
            startStatsCounter(it)
        }

        binding.exploreCourseBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_exploreCourseFragment)
        }

        binding.getStartedBtn.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_signupFragment)
        }
    }

    private fun FragmentHomeBinding.setFooterListeners() {
        linkedinBtn.setOnClickListener {
            openWebBrowser("https://www.linkedin.com/company/suretrust-ruralyouth/")
        }

        gmailBtn.setOnClickListener {
            openWebBrowser("mailto:suretrust2020@gmail.com")
        }

        githubBtn.setOnClickListener {
            openWebBrowser("https://github.com/sure-trust")
        }
    }

    private fun setNewsFlow() {
        binding.getNewsBtn.setOnClickListener {
            openDialog(
                LatestUpdatesDialogFragment.newInstance(),
                "News and Updates"
            )
        }
    }

    private fun setTextForCards() {
        //TODO: SERVER DATA
        binding.apply {
            blockTv1.apply {
                title.text = "Vision of SURE Trust"
                desc.text =
                    "Enhancing the employability of educated unemployed rural youth through ‘Human values-based skill up-gradation in emerging technologies, with no cost to students."
            }
            blockTv2.apply {
                title.text = "SURE Trust signed up on the NGO-DARPAN"
                desc.text =
                    "The NGO-DARPAN is a platform that provides space for interface between VOs/NGOs and key Government Ministries / Departments / Government Bodies."
            }
            blockTv3.apply {
                title.text = "SURE Trust is NGO Partner with TATA proengage"
                desc.text =
                    "Tata Engage is set up to institutionalise volunteering across the TATA Group, of companies, invite Tata colleagues, their family members and retired Tata employees to associate and engage with important causes and create a positive impact on the lives of many."
            }
            blockTv4.apply {
                title.text =
                    "SURE Trust - A Registered Enitity on MCA portal for Undertaking CSR Activities"
                desc.text =
                    "The entity has been registered for undertaking CSR activities and the Registration number is CSR00039792."
            }
        }
    }

    private fun setTrendingVideo() {
        val videoLink =
            "<html><body style=\"padding: 0; margin: 0; border-radius: 20px;\"><iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/4_NvQ57TYDo?si=ECgzeMnBP0sz1BFl\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe></body></html>"
        binding.trendingVideoPlayerView.apply {
            loadData(videoLink, "text/html", "utf-8")
            settings.javaScriptEnabled = true
            webChromeClient = WebChromeClient()
        }

    }

    private fun startStatsCounter(communityCount: CommunityCount) {

        val counter1Animation = ValueAnimator.ofInt(0, 300)
        val counter2Animation = ValueAnimator.ofInt(0, 1000)
        val counter3Animation = ValueAnimator.ofInt(0, 300)
        val counter4Animation = ValueAnimator.ofInt(0, communityCount.trainerCount)
        val counter5Animation = ValueAnimator.ofInt(0, communityCount.courseCount)
        val counter6Animation = ValueAnimator.ofInt(0, communityCount.batchCount)
        counter1Animation.addUpdateListener {
            binding.counterText1.text = counter1Animation.animatedValue.toString() + "+"
        }
        counter2Animation.addUpdateListener {
            binding.counterText2.text = counter2Animation.animatedValue.toString() + "+"
        }
        counter3Animation.addUpdateListener {
            binding.counterText3.text = counter3Animation.animatedValue.toString() + "+"
        }
        counter4Animation.addUpdateListener {
            binding.counterText4.text = counter4Animation.animatedValue.toString() + "+"
        }
        counter5Animation.addUpdateListener {
            binding.counterText5.text = counter5Animation.animatedValue.toString() + "+"
        }
        counter6Animation.addUpdateListener {
            binding.counterText6.text = counter6Animation.animatedValue.toString() + "+"
        }
        counter1Animation.apply {
            duration = 3000
            start()
        }

        counter2Animation.apply {
            duration = 3000
            start()
        }

        counter3Animation.apply {
            duration = 3000
            start()
        }

        counter4Animation.apply {
            duration = 3000
            start()
        }

        counter5Animation.apply {
            duration = 3000
            start()
        }

        counter6Animation.apply {
            duration = 3000
            start()
        }

    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}