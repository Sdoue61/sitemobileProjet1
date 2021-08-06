package com.example.projet12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.textfield.TextInputLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        @Suppress("DEPRECATION")
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val button1 = findViewById<Button>(R.id.bt_name)
        val entername = findViewById<EditText>(R.id.TV_name)

        button1.setOnClickListener {
            if (entername.text.toString().isEmpty()){
                Toast.makeText(this,"N'oubliez pas votre nom", Toast.LENGTH_LONG).show()
            }
            else{
                val intent = Intent(this, MainActivity2::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}