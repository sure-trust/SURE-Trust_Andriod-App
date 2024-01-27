package com.suretrustapp.suretrust.presentation.research

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.suretrustapp.suretrust.databinding.FragmentResearchBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import com.suretrustapp.suretrust.presentation.dialogs.ContactDetailsDialog
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class ResearchFragment : BaseFragment() {
    private var _binding: FragmentResearchBinding? = null
    private val binding: FragmentResearchBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentResearchBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.contactUsBtn.setOnClickListener {
            val fragmentManager = requireActivity().supportFragmentManager
            ContactDetailsDialog.newInstance().show(fragmentManager, tag)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}