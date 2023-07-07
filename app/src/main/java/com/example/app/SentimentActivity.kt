package com.example.app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.example.app.databinding.ActivityMainBinding
import com.example.app.databinding.ActivitySentimentBinding

class SentimentActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySentimentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivitySentimentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val webView: WebView = findViewById(R.id.webView)
        webView.settings.javaScriptEnabled = true
        webView.webViewClient = WebViewClient()

        val url = "https://shzfahad-sentiment-analysis.onrender.com/"
        webView.loadUrl(url)

        binding.button.setOnClickListener {
            finish()
        }


    }
}