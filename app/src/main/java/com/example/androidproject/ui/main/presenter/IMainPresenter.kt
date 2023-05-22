package com.example.androidproject.ui.main.presenter

import com.example.androidproject.ui.base.presenter.IPresenter
import com.example.androidproject.ui.main.interactor.IMainInteractor
import com.example.androidproject.ui.main.view.IMainView


interface IMainPresenter<V : IMainView, I : IMainInteractor> : IPresenter<V, I> {
    fun onTrend()
    fun onEvents()
    fun onAdd()
    fun onNotification()
    fun onSettings()

    fun getArticles()
}