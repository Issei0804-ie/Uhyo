package com.example.uhyo.entity

import com.example.uhyo.util.Turn

interface IBoardController {
    fun getPieces(): List<Piece>
    fun getTurn(): Turn
}
