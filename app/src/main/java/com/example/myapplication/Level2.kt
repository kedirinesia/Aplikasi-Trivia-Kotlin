package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Level2 : AppCompatActivity() {

    private lateinit var option1: Button
    private lateinit var option2: Button
    private lateinit var option3: Button
    private lateinit var option4: Button
    private lateinit var btnNext: Button
    private lateinit var opsi: TextView

    private var Jawab: Int = 0
    private val kunci: Int = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_level2)
        opsi = findViewById(R.id.Jawaban)
        option1 = findViewById(R.id.btnOption1)
        option2 = findViewById(R.id.btnOption2)
        option3 = findViewById(R.id.btnOption3)
        option4 = findViewById(R.id.btnOption4)
        btnNext = findViewById(R.id.btnNext)

        option1.setOnClickListener {
            Jawab = 1
            opsi.text = "Opsi Yang Dipilih : ${option1.text}"
        }

        option2.setOnClickListener {
            Jawab = 2
            opsi.text = "Opsi Yang Dipilih : ${option2.text}"
        }

        option3.setOnClickListener {
            Jawab = 3
            opsi.text = "Opsi Yang Dipilih : ${option3.text}"
        }

        option4.setOnClickListener {
            Jawab = 4
            opsi.text = "Opsi Yang Dipilih : ${option4.text}"
        }

        btnNext.setOnClickListener {
            if (Jawab == kunci) {
                Toast.makeText(this, "Jawaban Benar", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, Level3::class.java))
                finish()
            } else {
                Toast.makeText(this, "Jawaban Salah", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, MainActivity::class.java))
            }
        }
    }
}
