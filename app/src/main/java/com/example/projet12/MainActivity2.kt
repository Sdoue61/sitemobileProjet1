package com.example.projet12

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val ans1 = findViewById<Button>(R.id.ans1)
        val ans2 = findViewById<Button>(R.id.ans2)
        val ans3 = findViewById<Button>(R.id.ans3)
        val ans4 = findViewById<Button>(R.id.ans4)
        val resultat1 = findViewById<TextView>(R.id.TV_result)

        val intent = Intent(this, MainActivity3::class.java)

        val builder = AlertDialog.Builder(this)

        var counter = 0
        counter += 0
        resultat1.text = counter.toString()

        val myIntent = Intent(this, MainActivity3::class.java)
        myIntent.putExtra("compteur", counter)

        builder.setTitle("PERDU")
        builder.setMessage("La reponse etait Paris!")
        builder.setPositiveButton("Question Suivante") { _: DialogInterface, _: Int ->
            startActivity(myIntent)
            startActivity(intent)
        }

            ans1.setOnClickListener {
                builder.show()
            }

            ans2.setOnClickListener {
                counter += 1
                resultat1.text = counter.toString()
                builder.setTitle("BRAVO")
                builder.setMessage("Tu es un genie!")
                builder.setPositiveButton("Question Suivante") { _: DialogInterface, _: Int ->
                    startActivity(myIntent)
                    startActivity(intent)
                }
                builder.show()
            }

            ans3.setOnClickListener {
                builder.show()
            }

            ans4.setOnClickListener {
                builder.show()
            }
    }
}


