package com.jluqgon214.calculadora

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    //Declaración de variables
    private lateinit var resultado: TextView
    private lateinit var boton_CE: Button
    var resultadoString = ""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Inicializamos las variables al inicio de la App
        resultado = findViewById(R.id.resultado)
        boton_CE = findViewById(R.id.boton_ce)

        boton_CE.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                boton_CE()
            }
        })
    }

    fun boton_CE (){
        resultado.text = "0"
    }
}