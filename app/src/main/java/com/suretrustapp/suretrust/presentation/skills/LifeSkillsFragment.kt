package com.suretrustapp.suretrust.presentation.skills

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suretrustapp.suretrust.databinding.FragmentLifeSkillsBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import com.suretrustapp.suretrust.presentation.dialogs.SkillTrainingGuidelineDialogFragment

class LifeSkillsFragment : BaseFragment() {

    private var _binding: FragmentLifeSkillsBinding? = null
    private val binding: FragmentLifeSkillsBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLifeSkillsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.fillFormBtn.setOnClickListener {
            openWebBrowser("https://docs.google.com/forms/d/e/1FAIpQLSfxzs8-F6e979k0pjF2VArf07pA4sosPv8BZAHVPt-nyCuyIw/viewform")
        }

        binding.readGuidelinesBtn.setOnClickListener {
            openDialog(
                SkillTrainingGuidelineDialogFragment.newInstance(),
                "Guideline"
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}