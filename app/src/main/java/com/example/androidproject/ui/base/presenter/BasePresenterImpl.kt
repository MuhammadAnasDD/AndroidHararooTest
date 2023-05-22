package com.example.androidproject.ui.base.presenter

import com.androidnetworking.error.ANError
import com.example.androidproject.data.network.model.ErrorResponse
import com.example.androidproject.ui.base.interactor.IInteractor
import com.example.androidproject.ui.base.view.IView
import com.example.androidproject.util.SchedulerProvider
import com.google.gson.Gson
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

abstract class BasePresenterImpl<V : IView, I : IInteractor> internal constructor(protected var interactor: I?, protected val schedulerProvider: SchedulerProvider, protected val compositeDisposable: CompositeDisposable) :
    IPresenter<V, I> {

    @Inject
    lateinit var mGson: Gson

    private var view: V? = null
    private val isViewAttached: Boolean get() = view != null

    override fun onAttach(view: V?) {
        this.view = view
    }

    override fun getView(): V? = view

    override fun onDetach() {
        compositeDisposable.dispose()
        view = null
        interactor = null
    }

    override fun handleThrowable(throwable: Throwable) {
        getView()?.hideProgress()
        if (throwable is ANError) {
            try {
                val errorResponse = mGson.fromJson(throwable.errorBody, ErrorResponse::class.java)

            } catch (e: Exception) {
                e.printStackTrace()
            }
        }
        throwable.printStackTrace()
    }
}