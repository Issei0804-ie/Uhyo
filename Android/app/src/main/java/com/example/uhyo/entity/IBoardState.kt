package com.example.uhyo.entity

import com.example.uhyo.util.Col
import com.example.uhyo.util.Row
import com.example.uhyo.util.Turn

interface IBoardState {
    fun initBoard()
    fun getTurn(): Turn
    fun putPiece(row: Row, col: Col)
    fun checkPuttablePosition(row: Row, col: Col): Boolean
    fun checkPuttablePosition(): List<Piece>
    fun countBlackPiece(): Int
    fun countWhitePiece(): Int
    fun setTurn(turn: Turn)
}
