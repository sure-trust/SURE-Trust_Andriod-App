package com.suretrustapp.suretrust.presentation.bases

import android.os.Bundle
import android.view.Menu
import androidx.customview.widget.Openable
import androidx.navigation.FloatingWindow
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.suretrustapp.suretrust.R
import com.suretrustapp.suretrust.data.local.PreferenceHelper
import com.suretrustapp.suretrust.databinding.ActivityHomeBinding
import com.suretrustapp.suretrust.presentation.helper_screens.WebViewActivity
import dagger.hilt.android.AndroidEntryPoint
import java.lang.ref.WeakReference

@AndroidEntryPoint
class HomeActivity : BaseActivity() {
    private var _binding: ActivityHomeBinding? = null
    val binding get() = _binding!!
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.fragment)

        appBarConfiguration = AppBarConfiguration(navController.graph, binding.drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        manipulateMenus()
        handleManualNavigationClicks(navController, appBarConfiguration)
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

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun handleManualNavigationClicks(
        navController: NavController,
        appBarConfiguration: AppBarConfiguration
    ) {
        binding.navigationView.setNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.logoutMenu -> {
                    PreferenceHelper.authToken = null
                    manipulateMenus()
                    true
                }

                R.id.privacyPolicy -> {
                    WebViewActivity.openWebView(
                        this@HomeActivity,
                        "https://www.termsfeed.com/live/0a255dee-c98b-49b2-96e8-3bb3db3c616a",
                        "Privacy Policy"
                    )
                    true
                }

                else -> {
                    val handled = NavigationUI.onNavDestinationSelected(item, navController)
                    if (handled) {
                        val parent = binding.navigationView.parent
                        if (parent is Openable) {
                            parent.close()
                        }
                    }
                    handled
                }
            }
        }
        val weakReference = WeakReference(binding.navigationView)
        navController.addOnDestinationChangedListener(
            object : NavController.OnDestinationChangedListener {
                override fun onDestinationChanged(
                    controller: NavController,
                    destination: NavDestination,
                    arguments: Bundle?
                ) {
                    val view = weakReference.get()
                    if (view == null) {
                        navController.removeOnDestinationChangedListener(this)
                        return
                    }
                    if (destination is FloatingWindow) {
                        return
                    }
                }
            })
    }
}