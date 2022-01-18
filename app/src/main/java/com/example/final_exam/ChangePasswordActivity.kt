package com.example.final_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth

private lateinit var newPasswordView: EditText
private lateinit var changePasswordSubmitButton: Button

class ChangePasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_password)

        newPasswordView = findViewById(R.id.newPasswordView)
        changePasswordSubmitButton = findViewById(R.id.changePasswordSubmitButton)

        changePasswordSubmitButton.setOnClickListener() {

            val newpassword = newPasswordView.text.toString()

            if (newpassword.isEmpty()) {

                newPasswordView.error = "please enter a new Password"
                return@setOnClickListener
            }
            FirebaseAuth.getInstance().currentUser?.updatePassword(newpassword)
                ?.addOnCompleteListener { task ->

                    if (task.isSuccessful) {
                        Toast.makeText(this, "Success!", Toast.LENGTH_SHORT).show()
                    } else {

                        Toast.makeText(this, "there was a problem", Toast.LENGTH_SHORT).show()

                    }

                }
        }

    }
}