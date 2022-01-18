package com.example.final_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase



private lateinit var loginEmailView: EditText
private lateinit var loginPasswordView: EditText
private lateinit var logInButton: Button
private lateinit var registrationButton: Button
private lateinit var recoverPasswordButton: Button


class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        loginEmailView = findViewById(R.id.loginEmailView)
        loginPasswordView = findViewById(R.id.loginPasswordView)
        logInButton = findViewById(R.id.logInButton)
        registrationButton = findViewById(R.id.registrationButton)
        recoverPasswordButton = findViewById(R.id.recoverPasswordButton)

        registrationButton.setOnClickListener() {

            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)

        }

        recoverPasswordButton.setOnClickListener() {

            val intent = Intent(this, RecoverPasswordActivity::class.java)
            startActivity(intent)

        }

        logInButton.setOnClickListener() {

            val email = loginEmailView.text.toString()
            val password = loginPasswordView.text.toString()

            if (email.isEmpty()) {

                loginEmailView.error = "please enter an E-mail"
                return@setOnClickListener

            } else if (password.isEmpty()) {

                loginPasswordView.error = "please enter a Password"
                return@setOnClickListener
            }



            FirebaseAuth.getInstance()
                .signInWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()



                    } else {

                        Toast.makeText(this, "there was a problem!", Toast.LENGTH_SHORT).show()
                        
                    }

                }

        }

    }

    override fun onBackPressed() {
        Toast.makeText(this, "lmao", Toast.LENGTH_SHORT).show()
        super.onBackPressed()

    }

}