package com.suretrustapp.suretrust.presentation.bases

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.core.view.GravityCompat
import androidx.core.view.forEach
import androidx.customview.widget.Openable
import androidx.navigation.FloatingWindow
import androidx.navigation.NavController
import androidx.navigation.NavDestination
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.suretrustapp.suretrust.R
import com.suretrustapp.suretrust.data.local.PreferenceHelper
import com.suretrustapp.suretrust.data.local.PreferenceKey
import com.suretrustapp.suretrust.databinding.ActivityHomeBinding
import dagger.hilt.android.AndroidEntryPoint
import java.lang.ref.WeakReference

@AndroidEntryPoint
class HomeActivity : BaseActivity(), SharedPreferences.OnSharedPreferenceChangeListener {
    val TAG = "#$@HomeActivity"
    private var _binding: ActivityHomeBinding? = null
    val binding get() = _binding!!
    private lateinit var navController: NavController
    private lateinit var appBarConfiguration: AppBarConfiguration
    //private lateinit var listener: NavController.OnDestinationChangedListener

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        navController = findNavController(R.id.fragment)
        //binding.navigationView.setupWithNavController(navController)

        appBarConfiguration = AppBarConfiguration(navController.graph, binding.drawerLayout)
        setupActionBarWithNavController(navController, appBarConfiguration)
        manipulateMenus()
        lolPol(navController, appBarConfiguration)
//        listener = NavController
//            .OnDestinationChangedListener { controller, destination, arguments ->
//                Log.i(TAG, "OnDestinationChangedListener() called")
//                when (destination.id) {
//                    R.id.logoutMenu -> {
//                        Log.i(TAG, "destinationId is: ${destination.id}")
//                        Log.i(TAG, "logoutmenu  button clicked")
//                        PreferenceHelper.authToken = null
//                        manipulateMenus()
//                    }
//
//                    else -> {
//                        Log.i(TAG, "destinationId is: ${destination.id}")
//                    }
//                }
//            }
        /*binding.navigationView.setNavigationItemSelectedListener { it ->
            Log.i(TAG, "setNavigationItemSelectedListener() called: it.itemId: ${it.itemId}")
            if(it.itemId == R.id.logoutMenu){
                Log.i(TAG, "logoutmenu  button clicked")
                PreferenceHelper.authToken = null
                manipulateMenus()
                binding.drawerLayout.closeDrawer(GravityCompat.START)
                true
            }else{
                Log.i(TAG, "Some Other menu  button clicked")
                binding.drawerLayout.closeDrawer(GravityCompat.START)
                false
            }
        }*/
    }

    private fun manipulateMenus() {
        Log.i(TAG, "manipulateMenus() called")
        val menu: Menu = binding.navigationView.menu
        val logoutMenuItem = menu.findItem(R.id.logoutMenu)
        val registerMenuItem = menu.findItem(R.id.loginFragment)
        logoutMenuItem.isVisible = PreferenceHelper.authToken != null
        registerMenuItem.isVisible = PreferenceHelper.authToken == null

    }

    override fun onSupportNavigateUp(): Boolean {
        return findNavController(R.id.fragment).navigateUp(appBarConfiguration) || super.onSupportNavigateUp()
    }

    override fun onStart() {
        super.onStart()
        //navController.addOnDestinationChangedListener(listener)
    }

    override fun onStop() {
        super.onStop()
        //navController.removeOnDestinationChangedListener(listener)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    override fun onSharedPreferenceChanged(p0: SharedPreferences?, key: String?) {
        Log.i(TAG, "onSharedPreferenceChanged() called")
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

    private fun lolPol(navController: NavController, appBarConfiguration: AppBarConfiguration) {
        //NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration)
        binding.navigationView.setNavigationItemSelectedListener { item ->
            if (item.itemId == R.id.logoutMenu) {
                Log.i(TAG, "logoutmenu button was clicked")
                PreferenceHelper.authToken = null
                manipulateMenus()
                true
            } else {
                Log.i(TAG, "Some other btn was clicked")
                val handled = NavigationUI.onNavDestinationSelected(item, navController)
                if (handled) {
                    val parent = binding.navigationView.parent
                    if (parent is Openable) {
                        parent.close()
                    } else {
                        //Failed to navigate
                    }
                }
                handled
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