package com.example.aula5multimidia

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide


class RecuperaFotosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recupera_fotos)

        //Encontrando os elementos pelo ID
        var textView1 = findViewById<TextView>(R.id.textView1)
        var imageView1 = findViewById<ImageView>(R.id.imageView1)
        var textView2 = findViewById<TextView>(R.id.textView2)
        var imageView2 = findViewById<ImageView>(R.id.imageView2)
        var textView3 = findViewById<TextView>(R.id.textView3)
        var imageView3 = findViewById<ImageView>(R.id.imageView3)
        var textView4 = findViewById<TextView>(R.id.textView4)
        var imageView4 = findViewById<ImageView>(R.id.imageView4)
        var textView5 = findViewById<TextView>(R.id.textView5)
        var imageView5 = findViewById<ImageView>(R.id.imageView5)
        var textView6 = findViewById<TextView>(R.id.textView6)
        var imageView6 = findViewById<ImageView>(R.id.imageView6)

        //Array de animais
        var animais = arrayOf("Leão", "Pinguim", "Urso", "Girafa", "Tigre", "Rato")

        //Passando o nome dos animais para os elementos de texto
        textView1.text = animais[0]
        textView2.text = animais[1]
        textView3.text = animais[2]
        textView4.text = animais[3]
        textView5.text = animais[4]
        textView6.text = animais[5]

        //armazenando o link das imagens nas variaveis
        var i1 = "https://st.depositphotos.com/1020341/4233/i/450/depositphotos_42333899-stock-photo-portrait-of-huge-beautiful-male.jpg"
        var i2 = "https://www.vivernatural.com.br/wp-content/uploads/2018/04/%D0%9F%D0%B8%D0%BD%D0%B3%D0%B2%D0%B8%D0%BD-%D1%84%D0%BE%D1%82%D0%BE-min.jpg"
        var i3 = "https://media.moneytimes.com.br/uploads/2019/12/1-107.jpg"
        var i4 = "https://d5y9g7a5.rocketcdn.me/wp-content/uploads/2020/04/girafa-caracteristicas-e-comportamento-da-especie-1.jpg"
        var i5 = "https://static.todamateria.com.br/upload/ti/gr/tigredebengala-cke.jpg?auto_optimize=low"
        var i6 = "https://www.landrin.com.br/upload/pragas_5_66_1538744895.jpg"

        //Mostrando as imagens dentro dos imageView
        Glide.with(this).load(i1).into(imageView1)
        Glide.with(this).load(i2).into(imageView2)
        Glide.with(this).load(i3).into(imageView3)
        Glide.with(this).load(i4).into(imageView4)
        Glide.with(this).load(i5).into(imageView5)
        Glide.with(this).load(i6).into(imageView6)
    }

}
