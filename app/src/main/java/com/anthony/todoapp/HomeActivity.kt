package com.anthony.todoapp

import android.content.Intent
import android.icu.number.NumberFormatter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Display
import android.view.View
import android.widget.Button
import android.widget.TextView

class HomeActivity : AppCompatActivity() {

    private lateinit var usernameDisplay: TextView
    private lateinit var profileButton: Button
    private lateinit var setbutton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        usernameDisplay = findViewById(R.id.UsernameDisplay)
        profileButton = findViewById(R.id.button)
        setbutton = findViewById(R.id.button)

        profileButton.setOnClickListener {
         openProfilePage()}
        setbutton.setOnClickListener {
            openProfilePage()
        }

        usernameDisplay.text = "Welcome, ${intent.getStringExtra("name")}"
    }

    private fun openProfilePage(){
        val myIntent = Intent(this.createPackageContext())
    }
}