package com.raj.post3

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fullName = findViewById<EditText>(R.id.etFullName)
        val username = findViewById<EditText>(R.id.etUsername)
        val age = findViewById<EditText>(R.id.etAge)
        val email = findViewById<EditText>(R.id.etEmail)
        val rbMale = findViewById<RadioButton>(R.id.rbMale)
        val rbFemale = findViewById<RadioButton>(R.id.rbFemale)
        val password = findViewById<EditText>(R.id.etPassword)
        val confirmPassword = findViewById<EditText>(R.id.etConfirmPassword)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val name = fullName.text.toString()
            val user = username.text.toString()
            val userAge = age.text.toString()
            val userEmail = email.text.toString()
            val gender = when {
                rbMale.isChecked -> "Laki-laki"
                rbFemale.isChecked -> "Perempuan"
                else -> "Belum dipilih"
            }

            if (password.text.toString() != confirmPassword.text.toString()) {
                Toast.makeText(this, "Password tidak sama!", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("name", name)
                intent.putExtra("username", user)
                intent.putExtra("age", userAge)
                intent.putExtra("email", userEmail)
                intent.putExtra("gender", gender)
                startActivity(intent)
            }
        }
    }
}