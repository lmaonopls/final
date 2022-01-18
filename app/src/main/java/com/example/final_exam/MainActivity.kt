package com.example.final_exam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.final_exam.Fragments.MainCardsFragment
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

private lateinit var welcomeView: TextView
private lateinit var cheatButton: Button
private lateinit var changePasswordButton: Button
private lateinit var logOutButton: Button

private val auth = FirebaseAuth.getInstance()
private val database = FirebaseDatabase.getInstance().getReference("UserInfo")



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        welcomeView = findViewById(R.id.welcomeView)
        cheatButton = findViewById(R.id.cheatButton)
        changePasswordButton = findViewById(R.id.changePasswordButton)
        logOutButton = findViewById(R.id.logOutButton)



        database.child(auth.currentUser?.uid!!).addValueEventListener(object : ValueEventListener {
            override fun onDataChange(snapshot: DataSnapshot) {
                val userInfo: UserInfo = snapshot.getValue(UserInfo::class.java) ?: return
                welcomeView.text = "Welcome ${userInfo.firstName} ${userInfo.lastName}!"

            }

            override fun onCancelled(error: DatabaseError) {

            }

        })

        cheatButton.setOnClickListener() {

            val intent = Intent(this, GameActivity::class.java)
            startActivity(intent)

        }

        changePasswordButton.setOnClickListener() {

            val intent = Intent(this, ChangePasswordActivity::class.java)
            startActivity(intent)

        }

        logOutButton.setOnClickListener() {

            FirebaseAuth.getInstance()
                .signOut()
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()

        }

    }
}