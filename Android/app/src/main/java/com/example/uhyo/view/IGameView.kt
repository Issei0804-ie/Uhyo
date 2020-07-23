package com.example.uhyo.view

import com.example.uhyo.util.Col
import com.example.uhyo.util.Row
import com.example.uhyo.util.Turn

interface IGameView {
    fun showPutPiece(row: Row, col: Col, color: Turn)
    fun showReversePiece(row: Row, col: Col, color: Turn)
    fun showWhiteCount(n: Int)
    fun showBlackCount(n: Int)
    fun showPause()
    fun showPass()
    fun showTurn(color: Turn)
    fun showResult(winner: Turn)
    fun throwErrorText(text: String)
}
