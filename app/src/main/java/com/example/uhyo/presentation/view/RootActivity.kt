package com.example.uhyo.presentation.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.uhyo.R
import com.example.uhyo.presentation.presenter.view.IRootView
import com.example.uhyo.presentation.presenter.view.IViewHandler
import com.example.uhyo.presentation.util.Page

class RootActivity :
    AppCompatActivity(),
    IRootView,
    IViewHandler {
    private val fragmentManger = supportFragmentManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doTransaction(Page.MainMenu)
    }

    override fun doTransaction(page: Page) {
        doTransaction(page, true)
    }

    override fun doTransaction(page: Page, addToBackStack: Boolean) {
        val transaction = fragmentManger
            .beginTransaction()
            .replace(page.LayoutResId, fragmentShop(page))

        if (addToBackStack){
            transaction.addToBackStack(page.name).commit()
        }else{
            transaction.commit()
        }
    }

    private fun fragmentShop(page: Page): Fragment {
        return fragmentManger.findFragmentByTag(page.name) ?:
                when(page){
                    Page.MainMenu -> MainMenuFragment()
                }
    }

}
