package com.example.projet12

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog

class MainActivity2 : AppCompatActivity() {
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ans1 = findViewById<Button>(R.id.bt1)
        val ans2 = findViewById<Button>(R.id.bt2)
        val ans3 = findViewById<Button>(R.id.bt3)
        val ans4 = findViewById<Button>(R.id.bt4)
        val resultat1 = findViewById<TextView>(R.id.TV_result)
        val builder = AlertDialog.Builder(this)

            ans1.setOnClickListener() {
                builder.setTitle("PERDU")
                builder.setMessage("La reponse etait Paris!")
                builder.setPositiveButton("Question Suivante", null)
                builder.show()
                counter += 1
                resultat1.text = counter.toString()
            }

            ans2.setOnClickListener() {
                builder.setTitle("BRAVO")
                builder.setMessage("Tu es un genie!")
                builder.setPositiveButton("Question Suivante", null)
                builder.show()
                counter += 1
                resultat1.text = counter.toString()
            }

            ans3.setOnClickListener() {
                builder.setTitle("PERDU")
                builder.setMessage("La reponse etait Paris!")
                builder.setPositiveButton("Question Suivante", null)
                builder.show()
                counter += 1
                resultat1.text = counter.toString()
            }

            ans4.setOnClickListener() {
                builder.setTitle("PERDU")
                builder.setMessage("La reponse etait Paris!")
                builder.setPositiveButton("Question Suivante", null)
                builder.show()
                counter += 1
                resultat1.text = counter.toString()
            }
        val next = findViewById<Button>(R.id.bt_suivant1)
        next.setOnClickListener{
            val intent = Intent(this, MainActivity3::class.java)
            startActivity(intent)
            finish()
        }
    }
}


