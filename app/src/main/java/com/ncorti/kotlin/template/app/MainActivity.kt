package com.ncorti.kotlin.template.app

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import util.systemUtil


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    private fun View.hideKeyboard() {
        val inputManager = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputManager.hideSoftInputFromWindow(windowToken, 0)
    }

    override fun onStart() {
        super.onStart()
        Log.i("START","created On start")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i("START","created On Restart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("RESUME","created On Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("RESUME","App resumed")
    }
}
