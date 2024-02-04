package com.suretrustapp.suretrust.presentation.auth

import android.os.Bundle
import android.view.LayoutInflater
import android.view.Menu
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import com.suretrustapp.suretrust.R
import com.suretrustapp.suretrust.data.local.PreferenceHelper
import com.suretrustapp.suretrust.databinding.FragmentSignupBinding
import com.suretrustapp.suretrust.presentation.bases.BaseFragment
import com.suretrustapp.suretrust.presentation.bases.HomeActivity
import com.suretrustapp.suretrust.presentation.components.RegisterScreen
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
                onRegistrationComplete = {
                    findNavController().navigate(R.id.action_signupFragment_to_homeFragment)
                    val menu: Menu = (activity as? HomeActivity)?.binding?.navigationView?.menu!!
                    val logoutMenuItem = menu.findItem(R.id.logoutMenu)
                    val registerMenuItem = menu.findItem(R.id.loginFragment)
                    logoutMenuItem.isVisible = PreferenceHelper.authToken != null
                    registerMenuItem.isVisible = PreferenceHelper.authToken == null
                    Toast.makeText(requireContext(), "Registration Success", Toast.LENGTH_SHORT).show()
                },
                navigateToLogin = { findNavController().navigate(R.id.action_signupFragment_to_loginFragment) }
            )
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}