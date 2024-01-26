package com.suretrustofficial.suretrust.presentation.splash

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.suretrustofficial.suretrust.R
import com.suretrustofficial.suretrust.presentation.bases.BaseActivity
import com.suretrustofficial.suretrust.presentation.bases.HomeActivity
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

@SuppressLint("CustomSplashScreen")
@AndroidEntryPoint
class SplashActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                delay(2500L)
            }
            startActivity(Intent(this@SplashActivity, HomeActivity::class.java)).also { finish() }
        }
    }
}