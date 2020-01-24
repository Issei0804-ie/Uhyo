package com.example.uhyo.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.uhyo.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState == null){
            val fragment = MainMenuFragment()
            val transaction = supportFragmenteManager.beginTransaction()
            transaction.add(R.id.main_InsertFragmentLocation, fragment)
            transaction.commit()
        }
    }
}
