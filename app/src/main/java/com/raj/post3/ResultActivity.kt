package com.raj.post3

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resultactivity)

        val tvFullName = findViewById<TextView>(R.id.tvFullName)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        val tvAge = findViewById<TextView>(R.id.tvAge)
        val tvEmail = findViewById<TextView>(R.id.tvEmail)
        val tvGender = findViewById<TextView>(R.id.tvGender)

        val name = intent.getStringExtra("name")
        val username = intent.getStringExtra("username")
        val age = intent.getStringExtra("age")
        val email = intent.getStringExtra("email")
        val gender = intent.getStringExtra("gender")

        tvFullName.text = "Full Name: $name"
        tvUsername.text = "Username: $username"
        tvAge.text = "Age: $age"
        tvEmail.text = "Email: $email"
        tvGender.text = "Gender: $gender"
    }
}