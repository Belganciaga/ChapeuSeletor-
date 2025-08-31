package com.example.chapeuseletor

import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle

import android.widget.ImageView

import android.widget.TextView

class ResultadoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_resultado)
        val textResultado = findViewById<TextView>(R.id.textResultado)

        val imageBrasao = findViewById<ImageView>(R.id.imageBrasao)

        val nomeCasa = intent.getStringExtra("EXTRA_CASA_NOME")

        textResultado.text = "Você pertence à... $nomeCasa!"

        val idImagem = when (nomeCasa) {

            "Grifinória" -> R.drawable.grifinoria // Use os nomes exatos dos seus arquivos!

            "Corvinal" -> R.drawable.corvinal

            "Sonserina" -> R.drawable.sonserina

            "Lufa-Lufa" -> R.drawable.lufalufa

            else -> 0

        }

        if (idImagem != 0) {

            imageBrasao.setImageResource(idImagem)

        }

    }

}