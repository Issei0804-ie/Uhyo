package com.example.uhyo.presentation.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.uhyo.R
import com.example.uhyo.presentation.presenter.IMainMenuPresenter
import com.example.uhyo.presentation.presenter.MainMenuPresenter
import kotlinx.android.synthetic.main.fragment_main_menu.*

class MainMenuFragment : Fragment() {

    private lateinit var presenter: MainMenuPresenter

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

        presenter = MainMenuPresenter(
            this.id,
            activity as IMainMenuPresenter.ChangeMainMenu
        )

        SoloPlayButton.setOnClickListener {
            presenter.onClickSoloPlayButton()
        }
        TwoPlayerButton.setOnClickListener {
            presenter.onClickTwoPlayerButton()
        }
        OnlinePlayButton.setOnClickListener {
            presenter.onClickOnlinePlayButton()
        }
        SettingButton.setOnClickListener {
            presenter.onClickSettingButton()
        }
    }
}