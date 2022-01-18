package com.example.final_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.Toast
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.FirebaseDatabase

private lateinit var firstNameView: EditText
private lateinit var lastNameView: EditText
private lateinit var registrationEmailView: EditText
private lateinit var createPasswordView: EditText
private lateinit var repeatPasswordView: EditText
private lateinit var fullAgeChecker: CheckBox
private lateinit var conditionChecker: CheckBox
private lateinit var submitButton: Button

private val auth = FirebaseAuth.getInstance()
private val database = FirebaseDatabase.getInstance().getReference("UserInfo")

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        firstNameView = findViewById(R.id.firstNameView)
        lastNameView = findViewById(R.id.lastNameView)
        registrationEmailView = findViewById(R.id.registrationEmailView)
        createPasswordView = findViewById(R.id.createPasswordView)
        repeatPasswordView = findViewById(R.id.repeatPasswordView)
        fullAgeChecker = findViewById(R.id.fullAgeChecker)
        conditionChecker = findViewById(R.id.conditionChecker)
        submitButton = findViewById(R.id.submitButton)

        submitButton.setOnClickListener() {

            val firstname = firstNameView.text.toString()
            val lastname = lastNameView.text.toString()
            val email = registrationEmailView.text.toString()
            val password = createPasswordView.text.toString()
            val repeatpassword = repeatPasswordView.text.toString()

            if (firstname.isEmpty()) {
                firstNameView.error = "please enter your first name"
                return@setOnClickListener

            } else if (lastname.isEmpty()) {
                lastNameView.error = "please enter your last name"
                return@setOnClickListener

            } else if (email.isEmpty()) {
                registrationEmailView.error = "please enter an E-mail"
                return@setOnClickListener

            } else if (password.isEmpty()) {
                createPasswordView.error = "please enter a Password"
                return@setOnClickListener
            } else if (repeatpassword.isEmpty()) {
                repeatPasswordView.error = "please repeat a Password"
                return@setOnClickListener
            } else if (!email.contains("@")) {
                registrationEmailView.error = "please insert an Email correctly"
                return@setOnClickListener
            } else if (password.length < 9) {
                createPasswordView.error = "password should contain no less than 9 symbols"
                return@setOnClickListener
            } else if (!password.contains(Regex("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%!\\-_?&])"))) {
                createPasswordView.error = "password should contain uppercase and lowercase letters, symbols and digits"
                return@setOnClickListener
            } else if (password != repeatpassword) {
                repeatPasswordView.error = "repeated password should be the same"
                return@setOnClickListener
            } else if (!fullAgeChecker.isChecked) {
                fullAgeChecker.error = "you can't complete the registration unless you're 18 years old!"
                return@setOnClickListener
            } else if (!conditionChecker.isChecked) {
                conditionChecker.error = "please accept the terms and conditions!"
                return@setOnClickListener
            }

            FirebaseAuth.getInstance()
                .createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener { task ->
                    if (task.isSuccessful) {
                        val intent = Intent(this, LoginActivity::class.java)
                        startActivity(intent)
                        finish()

                        val userInfo = UserInfo(firstname, lastname)

                        database.child(auth.currentUser?.uid!!).setValue(userInfo)

                    } else {

                        Toast.makeText(this, "there was a registration problem!", Toast.LENGTH_SHORT).show()
                    }
                }


        }

    }
}
