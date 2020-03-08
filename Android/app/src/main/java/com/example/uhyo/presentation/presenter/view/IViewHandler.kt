package com.example.uhyo.presentation.presenter.view

import com.example.uhyo.presentation.util.Page

interface IViewHandler {
    fun doTransaction(page: Page)
    fun doTransaction(page: Page, addToBackStack: Boolean)
}