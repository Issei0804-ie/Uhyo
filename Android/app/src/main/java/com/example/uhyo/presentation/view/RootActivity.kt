package com.example.uhyo.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.uhyo.R
import com.example.uhyo.presentation.presenter.view.IRootView
import com.example.uhyo.presentation.presenter.view.IViewHandler

class RootActivity :
    AppCompatActivity(),
    IRootView,
    IViewHandler {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }
}
