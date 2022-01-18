package com.example.final_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

private lateinit var recoveryEmail: EditText
private lateinit var recoverButton: Button

class RecoverPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recover_password)

        recoveryEmail = findViewById(R.id.recoveryEmail)
        recoverButton  = findViewById(R.id.recoverButton)

        recoverButton.setOnClickListener() {

            val emailrecovery = recoveryEmail.text.toString()

            if (emailrecovery.isEmpty()) {

                recoveryEmail.error = "please enter an E-mail"
                return@setOnClickListener
            }
            FirebaseAuth.getInstance()
                .sendPasswordResetEmail(emailrecovery)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        Toast.makeText(this, "Check your E-mail", Toast.LENGTH_SHORT).show()

                    } else {

                        Toast.makeText(this, "there was a problem!", Toast.LENGTH_SHORT).show()

                    }

                }

        }

    }
}