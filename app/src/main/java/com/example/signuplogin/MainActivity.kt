package com.example.signuplogin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.net.PasswordAuthentication

class MainActivity : AppCompatActivity() {
    lateinit var btnLogin: Button
    lateinit var btnSignup: Button
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        castingViews()
        onClickListener()
    }
    fun castingViews(){
        btnLogin = findViewById(R.id.btnLogin)
        btnSignup = findViewById(R.id.btnSignup)
        etEmail = findViewById(R.id.etEmail)
        etPassword = findViewById(R.id.etPassword)
    }
    fun onClickListener(){
        if (etEmail.text.toString().isEmpty()||(etPassword.text.toString().isEmpty())){
            etEmail.setError("Empty email")
            etPassword.setError("Empty Password")
        }
    var feedBack = "You are welcome"
    btnLogin.setOnClickListener {
        Toast.makeText(baseContext,feedBack,Toast.LENGTH_LONG).show()
    }
    btnSignup.setOnClickListener {
        var intent = Intent(baseContext,Signup::class.java)
        startActivity(intent)
    }
    }
}