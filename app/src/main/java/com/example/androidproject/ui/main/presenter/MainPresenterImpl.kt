package com.example.androidproject.ui.main.presenter

import com.example.androidproject.ui.base.presenter.BasePresenterImpl
import com.example.androidproject.ui.main.interactor.IMainInteractor
import com.example.androidproject.ui.main.view.IMainView
import com.example.androidproject.util.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

class MainPresenterImpl<V : IMainView, I : IMainInteractor> @Inject internal constructor(interactor: I, schedulerProvider: SchedulerProvider, disposable: CompositeDisposable) : BasePresenterImpl<V, I>(interactor = interactor, schedulerProvider = schedulerProvider, compositeDisposable = disposable), IMainPresenter<V, I> {

    override fun onTrend() {

    }

    override fun onEvents() {

    }

    override fun onAdd() {

    }

    override fun onNotification() {

    }

    override fun onSettings() {

    }

    override fun getArticles() {
        getView()?.showProgress()
        interactor?.let {
            compositeDisposable.add(
                it.getArticleResponse()
                    .compose(schedulerProvider.ioToMainSingleScheduler())
                    .subscribe({ result ->
                        getView()?.showArticleList(result.results)
                        getView()?.hideProgress()
                    }, { throwable ->
                        // handle error
                        getView()?.hideProgress()
                        handleThrowable(throwable)
                    })
            )
        }
    }
}