package com.example.projet12

import android.content.DialogInterface
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        val ans1 = findViewById<Button>(R.id.ans1_2)
        val ans2 = findViewById<Button>(R.id.ans2_2)
        val ans3 = findViewById<Button>(R.id.ans3_2)
        val ans4 = findViewById<Button>(R.id.ans4_2)
        val resultat2 = findViewById<TextView>(R.id.TV_result_2)

        val intent = Intent(this, MainActivity::class.java)

        var counter2 = getIntent().getIntExtra("compteur", 0)
            resultat2.text = counter2.toString()

        val builder2 = AlertDialog.Builder(this)
            builder2.setTitle("PERDU")
            builder2.setMessage("La reponse etait Rome!")
            builder2.setPositiveButton("Recommencez le jeu") { _: DialogInterface, _: Int ->
                startActivity(intent)
        }

        ans1.setOnClickListener {
            builder2.show()
        }

        ans2.setOnClickListener {
            builder2.show()
        }

        ans3.setOnClickListener {
            counter2 += 1
            resultat2.text = counter2.toString()
            builder2.setTitle("BRAVO")
            builder2.setMessage("Tu es un genie!")
            builder2.setPositiveButton("Recommencez le jeu") { _: DialogInterface, _: Int ->
                startActivity(intent)
            }
            builder2.show()
        }

        ans4.setOnClickListener {
            builder2.show()
        }
    }
}