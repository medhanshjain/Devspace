package com.example.chargeup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class Mcd : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mcd)
    }

    fun menuPage(view: android.view.View) {
        val intent = Intent(this, Menu::class.java)
        startActivity(intent)
    }
}