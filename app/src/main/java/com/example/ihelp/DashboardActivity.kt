package com.example.ihelp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.widget.ImageView

class DashboardActivity : AppCompatActivity() {

    private lateinit var menu: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        menu = findViewById(R.id.menu)
        menu.setOnClickListener {
            var i = Intent(this, RecycleViewActivity::class.java)
            startActivity(i)
            finish()
        }

    }
}