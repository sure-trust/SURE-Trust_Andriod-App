package com.suretrustapp.suretrust.presentation.bases


import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.NavController
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.navigation.NavigationView
import com.suretrustapp.suretrust.R
import com.suretrustapp.suretrust.data.local.PreferenceHelper
import com.suretrustapp.suretrust.data.local.PreferenceKey
import com.suretrustapp.suretrust.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class HomeActivity : BaseActivity(), SharedPreferences.OnSharedPreferenceChangeListener,
    NavigationView.OnNavigationItemSelectedListener {
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
        setNavigationViewListener()
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

    private fun setNavigationViewListener() {
        val navigationView = findViewById<NavigationView>(R.id.navigation_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
    }

    private fun manipulateMenus() {
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

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.logoutMenu -> {
                PreferenceHelper.authToken = null
                manipulateMenus()
            }
        }
        return true
    }
}