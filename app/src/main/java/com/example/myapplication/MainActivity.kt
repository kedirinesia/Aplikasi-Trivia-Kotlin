package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var btnStart: Button
    private lateinit var btnOption: Button
    private lateinit var btnExit: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)


        btnStart = findViewById(R.id.btnStart)
        btnOption = findViewById(R.id.btnOption)
        btnExit = findViewById(R.id.btnExit)

        btnStart.setOnClickListener {

        startActivity(Intent(this,StartActivity::class.java))



        }

        btnOption.setOnClickListener {
     startActivity(Intent(this, OptionActivity::class.java))



        //   var Intent= intent()
        }

        btnExit.setOnClickListener {
            finishAffinity()
        }
    }
}
