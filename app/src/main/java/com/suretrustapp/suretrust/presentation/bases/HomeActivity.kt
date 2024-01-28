package com.suretrustapp.suretrust.presentation.bases

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.suretrustapp.suretrust.R
import com.suretrustapp.suretrust.data.local.PreferenceHelper
import com.suretrustapp.suretrust.data.local.PreferenceKey
import com.suretrustapp.suretrust.databinding.ActivityHomeBinding
import com.suretrustapp.suretrust.presentation.components.LoginScreen
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class HomeActivity : BaseActivity(), SharedPreferences.OnSharedPreferenceChangeListener {
    private var _binding: ActivityHomeBinding? = null
    val binding get() = _binding!!
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var listener: NavController.OnDestinationChangedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        navController = findNavController(R.id.fragment)
        binding.navigationView.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(navController.graph, binding.drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        manipulateMenus()
        listener = NavController
            .OnDestinationChangedListener { controller, destination, arguments ->
                when (destination.id) {
                    R.id.logoutMenu -> {
                        PreferenceHelper.authToken = null
                        manipulateMenus()
                    }
                }
            }
    }

    private fun manipulateMenus(){
        val menu: Menu = binding.navigationView.menu
        val logoutMenuItem = menu.findItem(R.id.logoutMenu)
        val registerMenuItem = menu.findItem(R.id.loginFragment)
        logoutMenuItem.isVisible = PreferenceHelper.authToken != null
        registerMenuItem.isVisible = PreferenceHelper.authToken == null

    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.fragment).navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onResume() {
        super.onResume()
        navController.addOnDestinationChangedListener(listener)
    }

    override fun onPause() {
        super.onPause()
        navController.removeOnDestinationChangedListener(listener)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onSharedPreferenceChanged(p0: SharedPreferences?, key: String?) {
        when (key) {
            PreferenceKey.AUTH_TOKEN -> {
                val menu: Menu = binding.navigationView.menu
                val logoutMenuItem = menu.findItem(R.id.logoutMenu)
                val registerMenuItem = menu.findItem(R.id.loginFragment)
                logoutMenuItem.isVisible = PreferenceHelper.authToken != null
                registerMenuItem.isVisible = PreferenceHelper.authToken == null
            }
        }
    }
}