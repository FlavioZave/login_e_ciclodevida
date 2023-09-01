package com.example.logincomactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }
    override fun onStart() {
        super.onStart()
        Log.v("Home", "App Iniciado!")
    }
    override fun onStop() {
        super.onStop()
        Log.v("StopLogin", "função stop login")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.v("DestroyLogin", "função destroy login")
    }
}