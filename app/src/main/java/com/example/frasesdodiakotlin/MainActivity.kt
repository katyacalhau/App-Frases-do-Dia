package com.example.frasesdodiakotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var texto: TextView
    val frases = arrayOf(
        "Cada cliente é como se fosse primeiro e único",
        "A arte de ser ora audacioso, ora prudente, é a arte de vencer"
    )


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        texto = findViewById (R.id.textoFrase) as TextView
    }

fun gerarFrase(view: View) {


    val totalItensArray = frases.size
    val numeroAleatorio = Random().nextInt(totalItensArray)

    texto.setText(frases[numeroAleatorio])
    }
}