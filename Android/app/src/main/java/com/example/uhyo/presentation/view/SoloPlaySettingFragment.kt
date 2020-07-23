package com.example.uhyo.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController
import com.example.uhyo.R
import kotlinx.android.synthetic.main.fragment_main_solo_setting.*

class SoloPlaySettingFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main_solo_setting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        button_back.setOnClickListener {
            it.findNavController().popBackStack()
        }
    }
}
