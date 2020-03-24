package com.example.uhyo.presentation.view

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.uhyo.R
import com.google.android.material.tabs.TabLayout
import kotlinx.android.synthetic.main.fragment_main_solo_setting.*

class SoloPlaySettingFragment : Fragment() {
    private val logTag = javaClass.simpleName

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        super.onCreateView(inflater, container, savedInstanceState)
        return inflater.inflate(R.layout.fragment_main_solo_setting, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        button_back.setOnClickListener {
            it.findNavController().popBackStack()
            Log.d(logTag, "click: button_back")
        }

        button_play.setOnClickListener {
            it.findNavController().navigate(R.id.action_soloPlaySetting_to_offlinePlay)
            Log.d(logTag, "click: button_play")
        }
    }
}
