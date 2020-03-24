package com.example.uhyo.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import androidx.navigation.findNavController
import com.example.uhyo.R
import kotlinx.android.synthetic.main.fragment_main_menu.*

class MainMenuFragment : Fragment() {
    private val logTag = javaClass.simpleName

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_main_menu, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        button_MainMenu_soloPlay.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainMenu_to_soloPlaySetting)
            Log.d(logTag, "click: button_MainMenu_soloPlay")
        }

        button_MainMenu_duoPlay.setOnClickListener {
            it.findNavController().navigate(R.id.action_mainMenu_to_offlinePlay)
            Log.d(logTag, "click: button_MainMenu_duoPlay")
        }

        button_MainMenu_onlinePlay.setOnClickListener {
            //TODO オンラインプレイ画面へ遷移
            Log.d(logTag, "click: button_MainMenu_onlinePlay")
        }
    }
}
