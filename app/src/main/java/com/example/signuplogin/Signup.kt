package com.example.signuplogin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class Signup : AppCompatActivity() {
    lateinit var etName: EditText
    lateinit var etPhoneNumber: EditText
    lateinit var btnEnter: Button
    lateinit var etEmail: EditText
    lateinit var etPassword: EditText
    lateinit var spGender: Spinner

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        castingViews()
        onClickListener()
    }

    private fun  castingViews(){
        btnEnter =findViewById(R.id.btnEnter)
        etName =findViewById(R.id.etName)
        etEmail =findViewById(R.id.etPassword)
        spGender =findViewById(R.id.spGender)
        etPhoneNumber =findViewById(R.id.etPhoneNumber)

        var genders = arrayOf("Female","Male","Other")
        var genderAdapter = ArrayAdapter<String>(baseContext,android.R.layout.simple_expandable_list_item_1)
        genderAdapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line)
        spGender.adapter = genderAdapter
    }

    private fun onClickListener(){
        var gender = spGender.toString()
        if(etName.text.toString().isEmpty()||(etPassword.text.toString().isEmpty())||etEmail.text.toString().isEmpty()||(etPhoneNumber.text.toString().isEmpty())){
                    etName.setError("Enter your Name")
                    etEmail.setError("Enter your Email")
                    etPassword.setError("Enter your Password")
                    etPhoneNumber.setError("Write your contact")
        }
    var message = "Thank you for signing up,you are welcome"
    Toast.makeText(baseContext, "message", Toast.LENGTH_LONG).show()
    }

}
