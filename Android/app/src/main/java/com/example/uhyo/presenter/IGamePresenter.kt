package com.example.uhyo.presenter

import com.example.uhyo.util.Col
import com.example.uhyo.util.Row

interface IGamePresenter {
    fun onStart()
    fun onClickPauseButton()
    fun onClickBoardPosition(row: Row, col: Col)
}
