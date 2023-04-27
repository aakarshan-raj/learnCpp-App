package com.example.learncpp_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.WindowManager

class mainSplash : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_splash)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        setContentView(R.layout.activity_main)

        // on below line we are calling
        // handler to run a task
        // for specific time interval
        Handler().postDelayed({
            // on below line we are
            // creating a new intent
            val i = Intent(
                this@mainSplash,
                MainActivity::class.java
            )
            // on below line we are
            // starting a new activity.
            startActivity(i)

            // on the below line we are finishing
            // our current activity.
            finish()
        }, 2000)
    }
}