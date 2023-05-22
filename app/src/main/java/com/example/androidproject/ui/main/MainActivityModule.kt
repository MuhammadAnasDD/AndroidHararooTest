package com.example.androidproject.ui.main

import com.example.androidproject.ui.main.interactor.IMainInteractor
import com.example.androidproject.ui.main.interactor.MainInteractorImpl
import com.example.androidproject.ui.main.presenter.IMainPresenter
import com.example.androidproject.ui.main.presenter.MainPresenterImpl
import com.example.androidproject.ui.main.view.IMainView
import dagger.Module
import dagger.Provides

@Module
class MainActivityModule {

    @Provides
    internal fun provideMainInteractor(mainInteractorImpl: MainInteractorImpl): IMainInteractor = mainInteractorImpl

    @Provides
    internal fun provideMainPresenter(mainPresenterImpl: MainPresenterImpl<IMainView, IMainInteractor>)
            : IMainPresenter<IMainView, IMainInteractor> = mainPresenterImpl

}