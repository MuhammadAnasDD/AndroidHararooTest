package com.example.androidproject.ui.base.presenter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00030\u0005B!\b\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00018\u0001\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0002\u0010\u000bJ\u000f\u0010 \u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010!J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0016J\u0017\u0010&\u001a\u00020#2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0016\u00a2\u0006\u0002\u0010\'J\b\u0010(\u001a\u00020#H\u0016R\u0014\u0010\t\u001a\u00020\nX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001e\u0010\u0006\u001a\u0004\u0018\u00018\u0001X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\bX\u0084\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0012\u0010\u001e\u001a\u0004\u0018\u00018\u0000X\u0082\u000e\u00a2\u0006\u0004\n\u0002\u0010\u001f\u00a8\u0006)"}, d2 = {"Lcom/example/androidproject/ui/base/presenter/BasePresenterImpl;", "V", "Lcom/example/androidproject/ui/base/view/IView;", "I", "Lcom/example/androidproject/ui/base/interactor/IInteractor;", "Lcom/example/androidproject/ui/base/presenter/IPresenter;", "interactor", "schedulerProvider", "Lcom/example/androidproject/util/SchedulerProvider;", "compositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "(Lcom/example/androidproject/ui/base/interactor/IInteractor;Lcom/example/androidproject/util/SchedulerProvider;Lio/reactivex/disposables/CompositeDisposable;)V", "getCompositeDisposable", "()Lio/reactivex/disposables/CompositeDisposable;", "getInteractor", "()Lcom/example/androidproject/ui/base/interactor/IInteractor;", "setInteractor", "(Lcom/example/androidproject/ui/base/interactor/IInteractor;)V", "Lcom/example/androidproject/ui/base/interactor/IInteractor;", "isViewAttached", "", "()Z", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "setMGson", "(Lcom/google/gson/Gson;)V", "getSchedulerProvider", "()Lcom/example/androidproject/util/SchedulerProvider;", "view", "Lcom/example/androidproject/ui/base/view/IView;", "getView", "()Lcom/example/androidproject/ui/base/view/IView;", "handleThrowable", "", "throwable", "", "onAttach", "(Lcom/example/androidproject/ui/base/view/IView;)V", "onDetach", "app_debug"})
public abstract class BasePresenterImpl<V extends com.example.androidproject.ui.base.view.IView, I extends com.example.androidproject.ui.base.interactor.IInteractor> implements com.example.androidproject.ui.base.presenter.IPresenter<V, I> {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.gson.Gson mGson;
    private V view;
    @org.jetbrains.annotations.Nullable()
    private I interactor;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.util.SchedulerProvider schedulerProvider = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.disposables.CompositeDisposable compositeDisposable = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getMGson() {
        return null;
    }
    
    public final void setMGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    private final boolean isViewAttached() {
        return false;
    }
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.Nullable()
    V view) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public V getView() {
        return null;
    }
    
    @java.lang.Override()
    public void onDetach() {
    }
    
    @java.lang.Override()
    public void handleThrowable(@org.jetbrains.annotations.NotNull()
    java.lang.Throwable throwable) {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final I getInteractor() {
        return null;
    }
    
    protected final void setInteractor(@org.jetbrains.annotations.Nullable()
    I p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.example.androidproject.util.SchedulerProvider getSchedulerProvider() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final io.reactivex.disposables.CompositeDisposable getCompositeDisposable() {
        return null;
    }
    
    public BasePresenterImpl(@org.jetbrains.annotations.Nullable()
    I interactor, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.util.SchedulerProvider schedulerProvider, @org.jetbrains.annotations.NotNull()
    io.reactivex.disposables.CompositeDisposable compositeDisposable) {
        super();
    }
}