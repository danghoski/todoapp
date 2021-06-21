package com.aghogho.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {

    val username = "admin"
    val password = "admin"

    private lateinit var usernameInput: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}