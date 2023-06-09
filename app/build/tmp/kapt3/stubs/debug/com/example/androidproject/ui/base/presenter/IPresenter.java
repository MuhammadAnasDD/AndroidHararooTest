package com.example.androidproject.ui.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\bf\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005J\u000f\u0010\u0006\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH&J\u0017\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00018\u0000H&\u00a2\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\tH&\u00a8\u0006\u0010"}, d2 = {"Lcom/example/androidproject/ui/base/presenter/IPresenter;", "V", "Lcom/example/androidproject/ui/base/view/IView;", "I", "Lcom/example/androidproject/ui/base/interactor/IInteractor;", "", "getView", "()Lcom/example/androidproject/ui/base/view/IView;", "handleThrowable", "", "throwable", "", "onAttach", "view", "(Lcom/example/androidproject/ui/base/view/IView;)V", "onDetach", "app_debug"})
public abstract interface IPresenter<V extends com.example.androidproject.ui.base.view.IView, I extends com.example.androidproject.ui.base.interactor.IInteractor> {
    
    public abstract void onAttach(@org.jetbrains.annotations.Nullable()
    V view);
    
    public abstract void onDetach();
    
    @org.jetbrains.annotations.Nullable()
    public abstract V getView();
    
    public abstract void handleThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable);
}