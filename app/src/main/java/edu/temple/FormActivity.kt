package edu.temple

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FormActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    val submitButton = findViewById<Button>(R.id.buttonSave)
    val uName = findViewById<TextView>(R.id.editTextUserName)
    val email = findViewById<TextView>(R.id.editTextEmailAddress)
    val password = findViewById<TextView>(R.id.editTextPassword)
    val verifyPassword = findViewById<TextView>(R.id.editTextConfirmPassword)

    submitButton.setOnClickListener{
        if (uName.text.toString() == ""||email.text.toString() == "" ||password.text.toString() == ""||
            verifyPassword.text.toString() == "") {
            if (uName.text.toString() == "")
                uName.error = "User name is required to register!"
            if (email.text.toString() == "")
                email.error = "Email is required to register!"
            if (password.text.toString() == "")
                password.error = "Password is required to register!"
            if (verifyPassword.text.toString() == "")
                verifyPassword.error = "Password verification is required to register!"
        }
        else if (password.text.toString() != verifyPassword.text.toString()) {
            password.error = "Password must match password verification!"
            verifyPassword.error = "Password verification must match password!"
        }
        else
            Toast.makeText(this@FormActivity, "Welcome, " + uName.text.toString() +
                    ", to the SignUpForm Application", Toast.LENGTH_LONG).show()



    }

}
}