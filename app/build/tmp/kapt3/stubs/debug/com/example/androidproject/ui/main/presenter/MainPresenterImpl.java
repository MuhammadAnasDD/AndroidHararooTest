package com.example.androidproject.ui.main.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u00052\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0006B\u001f\b\u0001\u0012\u0006\u0010\u0007\u001a\u00028\u0001\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u000eH\u0016J\b\u0010\u0011\u001a\u00020\u000eH\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0016\u00a8\u0006\u0014"}, d2 = {"Lcom/example/androidproject/ui/main/presenter/MainPresenterImpl;", "V", "Lcom/example/androidproject/ui/main/view/IMainView;", "I", "Lcom/example/androidproject/ui/main/interactor/IMainInteractor;", "Lcom/example/androidproject/ui/base/presenter/BasePresenterImpl;", "Lcom/example/androidproject/ui/main/presenter/IMainPresenter;", "interactor", "schedulerProvider", "Lcom/example/androidproject/util/SchedulerProvider;", "disposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/example/androidproject/ui/main/interactor/IMainInteractor;Lcom/example/androidproject/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "getArticles", "", "onAdd", "onEvents", "onNotification", "onSettings", "onTrend", "app_debug"})
public final class MainPresenterImpl<V extends com.example.androidproject.ui.main.view.IMainView, I extends com.example.androidproject.ui.main.interactor.IMainInteractor> extends com.example.androidproject.ui.base.presenter.BasePresenterImpl<V, I> implements com.example.androidproject.ui.main.presenter.IMainPresenter<V, I> {
    
    @java.lang.Override()
    public void onTrend() {
    }
    
    @java.lang.Override()
    public void onEvents() {
    }
    
    @java.lang.Override()
    public void onAdd() {
    }
    
    @java.lang.Override()
    public void onNotification() {
    }
    
    @java.lang.Override()
    public void onSettings() {
    }
    
    @java.lang.Override()
    public void getArticles() {
    }
    
    @javax.inject.Inject()
    public MainPresenterImpl(@org.jetbrains.annotations.NotNull()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable disposable) {
        super(null, null, null);
    }
}