package com.example.aula5multimidia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import kotlinx.android.synthetic.main.activity_usando_web_view.*

class usandoWebViewActivity  : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_usando_web_view)

        webview!!.webViewClient = object : WebViewClient() {
            override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                // Validando se a url é diferente de nulo
                if (url != null) {
                    view?.loadUrl(url)
                }
                return true
            }
        }
        //Habilitando o Jabascript
        webview!!.getSettings().setJavaScriptEnabled(true)

        //Passando a Url para o webview
        webview!!.loadUrl("https://www.fiap.com.br/")
    }
}