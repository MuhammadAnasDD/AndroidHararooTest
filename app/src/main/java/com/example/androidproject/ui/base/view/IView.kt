package com.example.androidproject.ui.base.view

interface IView {
    fun showProgress()
    fun hideProgress()
    enum class Status {
        SUCCESS,
        ERROR,
        NOTIFICATION
    }
}