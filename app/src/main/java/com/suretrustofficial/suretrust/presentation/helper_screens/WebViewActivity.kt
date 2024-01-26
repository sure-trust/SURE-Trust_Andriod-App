package com.suretrustofficial.suretrust.presentation.helper_screens

import android.R
import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.webkit.WebViewClient
import androidx.appcompat.app.ActionBar
import com.suretrustofficial.suretrust.databinding.ActivityWebViewBinding
import com.suretrustofficial.suretrust.presentation.bases.BaseActivity
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
@SuppressLint("SetJavaScriptEnabled")
class WebViewActivity : BaseActivity() {
    private var browserUrl: String? = null
    private var screenTitle: String? = null
    private var _binding: ActivityWebViewBinding? = null
    private val binding: ActivityWebViewBinding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = ActivityWebViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        browserUrl = intent.getStringExtra("url")
        screenTitle = intent.getStringExtra("screen_title")

        val actionBar: ActionBar? = supportActionBar
        actionBar?.apply {
            setDisplayHomeAsUpEnabled(true)
            title = screenTitle
        }

        if (browserUrl != null) {
            binding.webView.apply {
                loadUrl(browserUrl!!)
                settings.javaScriptEnabled = true
                webViewClient = WebViewClient()
            }
        } else {
            finish()
        }
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.home -> {
                finish()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    companion object {
        fun openWebView(context: Context, url: String, title: String) {
            val webViewIntent = Intent(context, WebViewActivity::class.java)
            webViewIntent.putExtra("url", url)
            webViewIntent.putExtra("screen_title", title)
            context.startActivity(webViewIntent)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }
}