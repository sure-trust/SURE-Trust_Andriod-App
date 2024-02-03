package com.suretrustapp.suretrust.presentation.auth

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.suretrustapp.suretrust.R
import com.suretrustapp.suretrust.data.local.PreferenceHelper
import com.suretrustapp.suretrust.data.local.PreferenceKey
import com.suretrustapp.suretrust.databinding.FragmentLoginBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import com.suretrustapp.suretrust.presentation.bases.HomeActivity
import com.suretrustapp.suretrust.presentation.components.LoginScreen
import com.suretrustapp.suretrust.presentation.helper_screens.WebViewActivity
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
                    val menu: Menu = (activity as? HomeActivity)?.binding?.navigationView?.menu!!
                    val logoutMenuItem = menu.findItem(R.id.logoutMenu)
                    val registerMenuItem = menu.findItem(R.id.loginFragment)
                    logoutMenuItem.isVisible = PreferenceHelper.authToken != null
                    registerMenuItem.isVisible = PreferenceHelper.authToken == null
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