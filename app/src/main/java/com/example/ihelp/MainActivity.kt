package com.example.ihelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {

    private lateinit var first: EditText
    private lateinit var last: EditText
    private lateinit var email: EditText
    private lateinit var pass: EditText
    private lateinit var signup: Button
    private lateinit var registered: TextView
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        first = findViewById(R.id.fname)
        last = findViewById(R.id.lname)
        email = findViewById(R.id.edtemail)
        pass = findViewById(R.id.edtpass)
        signup = findViewById(R.id.btnsignup)
        auth = Firebase.auth

        signup.setOnClickListener {
            val fame = first.text.toString()
            val lame = last.text.toString()
            val email = email.text.toString()
            val pass = pass.text.toString()


            auth.createUserWithEmailAndPassword(email, pass). addOnCompleteListener(this) {
                if (it.isSuccessful) {
                    Toast.makeText(this, "Successfully Signed Up", Toast.LENGTH_SHORT).show()
                    Log.d("Succ-->", it.toString())

                    var i = Intent(this, LoginActivity::class.java)
                    startActivity(i)
                    finish()

                }
                else {
                    Toast.makeText(this, "Signed Up Failed", Toast.LENGTH_SHORT).show()
                    Log.d("Error-->", it.toString())
                }
            }

        }

        registered = findViewById(R.id.textView)
        registered.setOnClickListener {
            var i = Intent(this, LoginActivity::class.java)
            startActivity(i)
            finish()
        }


        }

    }