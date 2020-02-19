package com.example.uhyo.presentation.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.uhyo.presentation.presenter.IMainMenuPresenter
import com.example.uhyo.R

class RootActivity :
    AppCompatActivity(),
    IMainMenuView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragment = MainMenuFragment()
            val transaction = supportFragmentManager.beginTransaction()
            transaction.add(R.id.main_InsertFragmentLocation, fragment)
            transaction.commit()
        }
    }

    fun doTransaction(containerViewId: Int, fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .addToBackStack("")
            .replace(containerViewId, fragment)
            .commit()
    }

    override fun changeSoloPlayDisplay(containerViewId: Int) {
        doTransaction(containerViewId, MainSoloFragment())
    }

    override fun changeTwoPlayDisplay(containerViewId: Int) {
        doTransaction(containerViewId, TODO())
    }

    override fun changeOnlinePlayDisplay(containerViewId: Int) {
        doTransaction(containerViewId, MainMultiFragment())
    }

    override fun changeSettingDisplay(containerViewId: Int) {
        doTransaction(containerViewId, TODO())
    }
}
