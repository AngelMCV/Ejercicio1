package com.example.prueba1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun activarbtn(view: View) {

        var mostar:String=nombre.text.toString()

        Toast.makeText(applicationContext, "Bienvenido $mostar esta app que no hace nada",Toast.LENGTH_SHORT).show()
    }
}