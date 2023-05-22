package com.example.androidproject.ui.main;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J-\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\t2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\fH\u0001\u00a2\u0006\u0002\b\r\u00a8\u0006\u000e"}, d2 = {"Lcom/example/androidproject/ui/main/MainActivityModule;", "", "()V", "provideMainInteractor", "Lcom/example/androidproject/ui/main/interactor/IMainInteractor;", "mainInteractorImpl", "Lcom/example/androidproject/ui/main/interactor/MainInteractorImpl;", "provideMainInteractor$app_debug", "provideMainPresenter", "Lcom/example/androidproject/ui/main/presenter/IMainPresenter;", "Lcom/example/androidproject/ui/main/view/IMainView;", "mainPresenterImpl", "Lcom/example/androidproject/ui/main/presenter/MainPresenterImpl;", "provideMainPresenter$app_debug", "app_debug"})
@dagger.Module()
public final class MainActivityModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.androidproject.ui.main.interactor.IMainInteractor provideMainInteractor$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.ui.main.interactor.MainInteractorImpl mainInteractorImpl) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.androidproject.ui.main.presenter.IMainPresenter<com.example.androidproject.ui.main.view.IMainView, com.example.androidproject.ui.main.interactor.IMainInteractor> provideMainPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.ui.main.presenter.MainPresenterImpl<com.example.androidproject.ui.main.view.IMainView, com.example.androidproject.ui.main.interactor.IMainInteractor> mainPresenterImpl) {
        return null;
    }
    
    public MainActivityModule() {
        super();
    }
}