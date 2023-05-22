package com.example.androidproject.ui.main.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005J\b\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0007H&J\b\u0010\n\u001a\u00020\u0007H&J\b\u0010\u000b\u001a\u00020\u0007H&J\b\u0010\f\u001a\u00020\u0007H&\u00a8\u0006\r"}, d2 = {"Lcom/example/androidproject/ui/main/presenter/IMainPresenter;", "V", "Lcom/example/androidproject/ui/main/view/IMainView;", "I", "Lcom/example/androidproject/ui/main/interactor/IMainInteractor;", "Lcom/example/androidproject/ui/base/presenter/IPresenter;", "getArticles", "", "onAdd", "onEvents", "onNotification", "onSettings", "onTrend", "app_debug"})
public abstract interface IMainPresenter<V extends com.example.androidproject.ui.main.view.IMainView, I extends com.example.androidproject.ui.main.interactor.IMainInteractor> extends com.example.androidproject.ui.base.presenter.IPresenter<V, I> {
    
    public abstract void onTrend();
    
    public abstract void onEvents();
    
    public abstract void onAdd();
    
    public abstract void onNotification();
    
    public abstract void onSettings();
    
    public abstract void getArticles();
}