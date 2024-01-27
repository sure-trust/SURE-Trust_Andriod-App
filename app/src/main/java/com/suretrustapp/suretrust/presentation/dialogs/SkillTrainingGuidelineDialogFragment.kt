package com.suretrustapp.suretrust.presentation.dialogs

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suretrustapp.suretrust.databinding.SkillsTrainingGuidelineLayoutBinding
import com.suretrustapp.suretrust.presentation.bases.BaseDialogFragment
import com.suretrustapp.suretrust.presentation.components.GuidelineView

class SkillTrainingGuidelineDialogFragment : BaseDialogFragment() {
    private var _binding: SkillsTrainingGuidelineLayoutBinding? = null
    private val binding: SkillsTrainingGuidelineLayoutBinding get() = _binding!!


    companion object {
        fun newInstance() = SkillTrainingGuidelineDialogFragment()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onStart() {
        super.onStart()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = SkillsTrainingGuidelineLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            GuidelineView {
                dismissAllowingStateLoss()
            }
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}