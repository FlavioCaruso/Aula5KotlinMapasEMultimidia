package com.example.aula5multimidia

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //Acessa a recuperação de fotos
    fun acessarRecuperacaoFotos(view: View){
        val intent = Intent(this, RecuperaFotosActivity::class.java)
        startActivity(intent)
    }

    //Acessa a área de usando webview em seus apps
    fun usandoWebView(view: View){
        val intent = Intent(this, usandoWebViewActivity::class.java)
        startActivity(intent)
    }

    //Acessa a área de sons
    fun acessarSons(view: View){
        val intent = Intent(this, SonsAudioActivity::class.java)
        startActivity(intent)
    }

    //Acessa a área de video media player
    fun acessarVideo(view: View){
        val intent = Intent(this, VideoMediaPlayerActivity::class.java)
        startActivity(intent)
    }

    //Acessa a área de animação
    fun acessarAnimacao(view: View){
        val intent = Intent(this, AnimationActivity::class.java)
        startActivity(intent)
    }
}