package com.example.uhyo.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.example.uhyo.R

class MainMenuFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        val view = inflater.inflate(R.layout.fragment_main_menu, container, false)
        onClickAction(view)
        return view
    }

    private fun onClickAction(view: View){
        val solo: Button = view.findViewById(R.id.mainMenuSoloPlayButton)
        val multi: Button = view.findViewById(R.id.mainMenu2PlayerButton)
        val online: Button = view.findViewById(R.id.mainMenuOnlinePlayButton)

        activity?.let {
            val fragmentManager = it.supportFragmentManager.beginTransaction()

            solo.setOnClickListener{
                fragmentManager.replace(R.id.main_InsertFragmentLocation,
                    MainSoloFragment()
                )
                fragmentManager.addToBackStack("")
                fragmentManager.commit()
            }
            multi.setOnClickListener{
                Toast.makeText(context, "mada", Toast.LENGTH_LONG).show()
            }
            online.setOnClickListener{
                fragmentManager.replace(
                    R.id.main_InsertFragmentLocation,
                    MainMultiFragment()
                )
                fragmentManager.addToBackStack("")
                fragmentManager.commit()
            }
        }
    }
}