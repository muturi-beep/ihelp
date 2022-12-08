package com.example.ihelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class FirstActivity : AppCompatActivity() {

    private lateinit var welcome: Button
    private lateinit var registered: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first2)

        welcome = findViewById(R.id.btnwelcome)
        welcome.setOnClickListener {
            var i = Intent(this, MainActivity::class.java)
            startActivity(i)
            finish()
        }

        registered = findViewById(R.id.textView)
        registered.setOnClickListener {
            var i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            finish()
        }
    }
}