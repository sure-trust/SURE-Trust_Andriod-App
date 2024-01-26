package com.suretrustofficial.suretrust.presentation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.suretrustofficial.suretrust.R
import com.suretrustofficial.suretrust.databinding.FragmentLoginBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseFragment
import com.suretrustofficial.suretrust.presentation.components.LoginScreen
import com.suretrustofficial.suretrust.presentation.helper_screens.WebViewActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LoginFragment : BaseFragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding: FragmentLoginBinding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.composeView.setContent {
            LoginScreen(
                onSuccess = { email, password ->
                    //handle the api
                    findNavController().navigate(R.id.action_loginFragment_to_homeFragment)
                },
                navigateToRegister = { findNavController().navigate(R.id.action_loginFragment_to_signupFragment) },
                onForgotPasswordClicked = {
                    WebViewActivity.openWebView(
                        requireContext(),
                        "https://platform.suretrustforruralyouth.com/users/reset_password/",
                        "Forgot Password"
                    )
                }
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}