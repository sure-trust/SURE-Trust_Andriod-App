package com.suretrustofficial.suretrust.presentation.dialogs

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.suretrustofficial.suretrust.R
import com.suretrustofficial.suretrust.databinding.ContactDetailsLayoutBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseBottomSheetFragment
import com.suretrustofficial.suretrust.presentation.utils.Helpers.Companion.copyTextToClipboard

class ContactDetailsDialog : BaseBottomSheetFragment() {

    private var _binding: ContactDetailsLayoutBinding? = null
    private val binding: ContactDetailsLayoutBinding get() = _binding!!

    companion object {
        fun newInstance() = ContactDetailsDialog()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        return super.onCreateDialog(savedInstanceState).apply {
            setOnShowListener {
                val bottomSheet =
                    findViewById<View>(com.google.android.material.R.id.design_bottom_sheet) as FrameLayout
                bottomSheet.setBackgroundResource(android.R.color.transparent)
            }
        }
    }

    override fun getTheme(): Int = R.style.SheetDialog

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        _binding = ContactDetailsLayoutBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            ph1.setOnClickListener {
                requireContext().copyTextToClipboard("9440045717")
            }

            ph2.setOnClickListener {
                requireContext().copyTextToClipboard("8309228027")
            }

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
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}