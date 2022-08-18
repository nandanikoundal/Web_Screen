package com.nandani.web_screen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView

class MainActivity : AppCompatActivity() {
    lateinit var webview : WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        webview = findViewById(R.id.webview)
        webview.loadUrl("https://www.google.com")
        webview.settings.javaScriptEnabled = true
    }

    override fun onBackPressed() {
        super.onBackPressed()
        if (webview.canGoBack()){
            webview.goBack()
        }else{
            super.onBackPressed()
        }
    }


}