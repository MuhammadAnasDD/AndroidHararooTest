package com.example.androidproject.ui.base.presenter

import com.example.androidproject.ui.base.interactor.IInteractor
import com.example.androidproject.ui.base.view.IView

interface IPresenter<V : IView, I : IInteractor> {

    fun onAttach(view: V?)

    fun onDetach()

    fun getView(): V?

    fun handleThrowable(throwable: Throwable)
}