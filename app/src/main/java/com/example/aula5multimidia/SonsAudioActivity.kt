package com.example.aula5multimidia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.media.MediaPlayer

class SonsAudioActivity : AppCompatActivity() {
    var vaca: MediaPlayer? = null
    var cachorro: MediaPlayer? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sons_audios)

        //Adicionando o arquivo de som a variavel
        vaca = MediaPlayer.create(this,R.raw.vaca_mugindo)
        cachorro = MediaPlayer.create(this,R.raw.cachorro)
    }

    //Valida se tem algo tocando, se houver, para o que estiver tocando e executa o som da vaca
    fun soundCow(view: View){
        if (vaca!!.isPlaying()){
            vaca!!.stop()
            vaca!!.prepare()
        }
        if (cachorro!!.isPlaying()){
            cachorro!!.stop()
            cachorro!!.prepare()
        }
        vaca!!.start()
    }

    //Valida se tem algo tocando, se houver, para o que estiver tocando e executa o som do cachorro
    fun soundDog(view: View){
        if (cachorro!!.isPlaying()){
            cachorro!!.stop()
            cachorro!!.prepare()
        }
        if (vaca!!.isPlaying()){
            vaca!!.stop()
            vaca!!.prepare()
        }
        cachorro!!.start()
    }
}