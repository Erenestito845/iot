package com.example.evaluacin_iot

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
private lateinit var btningresar: Button
private lateinit var btnregistrar: Button

class Act_login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_act_login)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.btn1)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btningresar = findViewById(R.id.btn_ingresar)
        btnregistrar = findViewById(R.id.btn_registrar)

        btningresar.setOnClickListener{
            val intent = Intent(this, Act_Menu_Crud::class.java)
            startActivity(intent)
        }
        btnregistrar.setOnClickListener{
            val intent = Intent(this, registro_usuario::class.java)
            startActivity(intent)
        }
    }
}