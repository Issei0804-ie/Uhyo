package com.example.uhyo.presentation.presenter

interface IMainMenuPresenter {
    fun onClickSoloPlayButton()
    fun onClickTwoPlayerButton()
    fun onClickOnlinePlayButton()
    fun onClickSettingButton()

    interface ChangeMainMenu {
        fun changeSoloPlayDisplay(containerViewId: Int)
        fun changeTwoPlayDisplay(containerViewId: Int)
        fun changeOnlinePlayDisplay(containerViewId: Int)
        fun changeSettingDisplay(containerViewId: Int)
    }
}