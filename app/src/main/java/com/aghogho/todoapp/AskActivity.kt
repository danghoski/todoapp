package com.aghogho.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class AskActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var askbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ask)

        askbutton = findViewById(R.id.askbutton)
        usernameDisplay.text = intent.getStringExtra("Username")

        askbutton.setOnClickListener {
            askbutton
        }
    }
}