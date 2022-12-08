package com.example.ihelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {

    private lateinit var etemail: EditText
    private lateinit var etpass: EditText
    private lateinit var btlogin: Button

    //creating a firebaseAuth object
    private lateinit var auth: FirebaseAuth


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //view binding
        etemail = findViewById(R.id.edt_email)
        etpass = findViewById(R.id.edt_pass)
        btlogin= findViewById(R.id.btn_login)

        //initializing FirebaseAuth
        auth = FirebaseAuth.getInstance()

        btlogin.setOnClickListener {
            val email = etemail.text.toString()
            val pass = etpass.text.toString()

            //calling signing with emai and password(email,pass)
            //using firebase auth object  on a successful display a toast

            auth.signInWithEmailAndPassword(email,pass).addOnCompleteListener(this) {
                if(it.isSuccessful) {
                    Toast.makeText(this, "Successfully Logged In", Toast.LENGTH_SHORT).show()

                    var i = Intent(this, DashboardActivity::class.java)
                    startActivity(i)
                    finish()

                }else {
                    Toast.makeText(this, "Log In Failed", Toast.LENGTH_SHORT).show()
                }
            }

        }
        }


    }