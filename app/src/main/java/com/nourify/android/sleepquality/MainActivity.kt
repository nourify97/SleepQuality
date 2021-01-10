package com.nourify.android.sleepquality

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity


/**
 * This main activity is just a container for our fragments,
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
    }
}
