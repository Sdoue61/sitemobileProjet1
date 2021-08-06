package com.example.projet12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity3 : AppCompatActivity() {
    var counter2 = 1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val ans1_2 = findViewById<Button>(R.id.page3bt1)
        val ans2_2 = findViewById<Button>(R.id.page3bt2)
        val ans3_2 = findViewById<Button>(R.id.page3bt3)
        val ans4_2 = findViewById<Button>(R.id.page3bt4)
        val resultat2 = findViewById<TextView>(R.id.TV_result_2)
        val builder_2 = AlertDialog.Builder(this)

        ans1_2.setOnClickListener() {
            builder_2.setTitle("PERDU")
            builder_2.setMessage("La reponse etait Rome!")
            builder_2.setPositiveButton("Question Suivante", null)
            builder_2.show()
            counter2 += 1
            resultat2.text = counter2.toString()
        }

        ans2_2.setOnClickListener() {
            builder_2.setTitle("PERDU")
            builder_2.setMessage("La reponse etait Rome!")
            builder_2.setPositiveButton("Question Suivante", null)
            builder_2.show()
            counter2 += 1
            resultat2.text = counter2.toString()
        }

        ans3_2.setOnClickListener() {
            builder_2.setTitle("BRAVO")
            builder_2.setMessage("Tu es un genie!")
            builder_2.setPositiveButton("Question Suivante", null)
            builder_2.show()
            counter2 += 1
            resultat2.text = counter2.toString()
        }

        ans4_2.setOnClickListener() {
            builder_2.setTitle("PERDU")
            builder_2.setMessage("La reponse etait Rome!")
            builder_2.setPositiveButton("Question Suivante", null)
            builder_2.show()
            counter2 += 1
            resultat2.text = counter2.toString()
        }
        val next = findViewById<Button>(R.id.bt_retour)
        next.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}