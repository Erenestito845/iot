package com.example.evaluacin_iot

import android.icu.text.SimpleDateFormat
import android.icu.util.Calendar
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

lateinit var fecha: TextView
lateinit var temp: android.widget.TextView
lateinit var hum: android.widget.TextView
lateinit var imagenTemp: ImageView

class Datos_sensores : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_datos_sensores)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        fecha=findViewById(R.id.txt_fecha)
        temp=findViewById(R.id.txt_temp)
        hum=findViewById(R.id.txt_humedad)
        imagenTemp=findViewById(R.id.imagen_temp)

        fecha.text = fechahora()
    }
    /*tenemos dos formas de colocar la fecha con dos tipos de llamando a la función:
    fecha.setText(fechahora() o fecha.tex = fechahora())*/
    fun fechahora(): String {
        val c: Calendar = Calendar.getInstance()
        val sdf: SimpleDateFormat = SimpleDateFormat("dd MMMM YYYY, hh:mm:ss a")
            val strDate: String = sdf.format(c.getTime())
        return strDate
    }
}