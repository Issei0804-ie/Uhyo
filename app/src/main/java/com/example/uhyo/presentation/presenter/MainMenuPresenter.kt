package com.example.uhyo.presentation.presenter

class MainMenuPresenter(
    private var containerViewId: Int,
    private val iView: IMainMenuPresenter.ChangeMainMenu
) : IMainMenuPresenter {


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