package com.suretrustofficial.suretrust.presentation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.suretrustofficial.suretrust.R
import com.suretrustofficial.suretrust.databinding.FragmentSignupBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseFragment
import com.suretrustofficial.suretrust.presentation.components.RegisterScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SignupFragment : BaseFragment() {
    private var _binding: FragmentSignupBinding? = null
    private val binding: FragmentSignupBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            RegisterScreen(
                onRegistrationComplete = {findNavController().navigate(R.id.action_signupFragment_to_homeFragment)},
                navigateToLogin = { findNavController().navigate(R.id.action_signupFragment_to_loginFragment) }
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}