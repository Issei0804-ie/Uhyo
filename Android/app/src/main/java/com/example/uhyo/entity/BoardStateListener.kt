package com.example.uhyo.entity

import com.example.uhyo.util.Turn

interface BoardStateListener {
    fun puttedPiece(piece: Piece)
    fun reversedPiece(piece: Piece)
    fun nextTurn(turn: Turn)
    fun pass()
    fun finishGame()
}
