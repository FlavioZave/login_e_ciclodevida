package com.example.logincomactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val buttonLogin: Button = findViewById(R.id.button_login)
        val login : EditText = findViewById(R.id.campo_login)
        val senha : EditText = findViewById(R.id.campo_senha)

        buttonLogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)

            if(login.text.isNotEmpty()) {

                if(senha.text.contentEquals("admin123")) {
                    startActivity(intent)

                }else{
                    Toast.makeText(this, "Senha inválida.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }
    override fun onStart() {
        super.onStart()
        Log.v("StartMain", "App Iniciado!")
    }
    override fun onStop() {
        super.onStop()
        Log.v("StopMain", "função stop main")

        val login : EditText = findViewById(R.id.campo_login)
        val senha : EditText = findViewById(R.id.campo_senha)
        login.text = null
        senha.text = null

    }
    override fun onDestroy() {
        super.onDestroy()
        Log.v("DestroyLogin", "função destroy main")
    }
}