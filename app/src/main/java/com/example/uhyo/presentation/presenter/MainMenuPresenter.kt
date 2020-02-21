package com.example.uhyo.presentation.presenter

import com.example.uhyo.presentation.view.IMainMenuView

class MainMenuPresenter(
    private var containerViewId: Int,
    private val iView: IMainMenuView
):IMainMenuPresenter {

    override fun onClickSoloPlayButton() {
        iView.changeSoloPlayDisplay(containerViewId)
    }

    override fun onClickTwoPlayerButton() {
        iView.changeTwoPlayDisplay(containerViewId)
    }

    override fun onClickOnlinePlayButton() {
        iView.changeOnlinePlayDisplay(containerViewId)
    }

    override fun onClickSettingButton() {
        iView.changeSettingDisplay(containerViewId)
    }
}