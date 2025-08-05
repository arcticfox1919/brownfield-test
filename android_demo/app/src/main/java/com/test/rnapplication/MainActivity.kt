package com.test.rnapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.callstack.reactnativebrownfield.ReactNativeBrownfield
import com.example.rnapp.ReactNativeHostManager


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        ReactNativeHostManager.initialize(this.application) {
            println("JS bundle loaded")
        }

        val rnView = ReactNativeBrownfield.shared.createView(this.applicationContext, this, "aar_demo")
        setContentView(rnView)
    }
}
