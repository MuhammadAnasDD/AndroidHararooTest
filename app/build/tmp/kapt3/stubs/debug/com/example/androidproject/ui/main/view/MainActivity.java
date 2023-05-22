package com.example.androidproject.ui.main.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 -2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001-B\u0005\u00a2\u0006\u0002\u0010\u0005J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u001bH\u0014J\u0012\u0010\"\u001a\u00020\u001b2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020$H\u0016J\u0006\u0010&\u001a\u00020\u001bJ\u0018\u0010\'\u001a\u00020\u001b2\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020*\u0018\u00010)H\u0016J\u000e\u0010+\u001a\b\u0012\u0004\u0012\u00020\b0,H\u0016R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R*\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00150\u00148\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019\u00a8\u0006."}, d2 = {"Lcom/example/androidproject/ui/main/view/MainActivity;", "Lcom/example/androidproject/ui/base/view/BaseActivity;", "Lcom/example/androidproject/ui/main/view/IMainView;", "Ldagger/android/support/HasSupportFragmentInjector;", "Landroid/view/View$OnClickListener;", "()V", "fragmentDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroidx/fragment/app/Fragment;", "getFragmentDispatchingAndroidInjector$app_debug", "()Ldagger/android/DispatchingAndroidInjector;", "setFragmentDispatchingAndroidInjector$app_debug", "(Ldagger/android/DispatchingAndroidInjector;)V", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "setMGson", "(Lcom/google/gson/Gson;)V", "presenter", "Lcom/example/androidproject/ui/main/presenter/IMainPresenter;", "Lcom/example/androidproject/ui/main/interactor/IMainInteractor;", "getPresenter$app_debug", "()Lcom/example/androidproject/ui/main/presenter/IMainPresenter;", "setPresenter$app_debug", "(Lcom/example/androidproject/ui/main/presenter/IMainPresenter;)V", "onClick", "", "view", "Landroid/view/View;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onFragmentAttached", "tag", "", "onFragmentDetached", "setupClickListeners", "showArticleList", "articles", "", "Lcom/example/androidproject/data/network/model/ResultData;", "supportFragmentInjector", "Ldagger/android/AndroidInjector;", "Companion", "app_debug"})
public final class MainActivity extends com.example.androidproject.ui.base.view.BaseActivity implements com.example.androidproject.ui.main.view.IMainView, dagger.android.support.HasSupportFragmentInjector, android.view.View.OnClickListener {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.example.androidproject.ui.main.presenter.IMainPresenter<com.example.androidproject.ui.main.view.IMainView, com.example.androidproject.ui.main.interactor.IMainInteractor> presenter;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> fragmentDispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.gson.Gson mGson;
    public static final com.example.androidproject.ui.main.view.MainActivity.Companion Companion = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.ui.main.presenter.IMainPresenter<com.example.androidproject.ui.main.view.IMainView, com.example.androidproject.ui.main.interactor.IMainInteractor> getPresenter$app_debug() {
        return null;
    }
    
    public final void setPresenter$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.ui.main.presenter.IMainPresenter<com.example.androidproject.ui.main.view.IMainView, com.example.androidproject.ui.main.interactor.IMainInteractor> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getFragmentDispatchingAndroidInjector$app_debug() {
        return null;
    }
    
    public final void setFragmentDispatchingAndroidInjector$app_debug(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getMGson() {
        return null;
    }
    
    public final void setMGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onFragmentAttached(@org.jetbrains.annotations.Nullable()
    java.lang.String tag) {
    }
    
    @java.lang.Override()
    public void onFragmentDetached(@org.jetbrains.annotations.NotNull()
    java.lang.String tag) {
    }
    
    public final void setupClickListeners() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    @java.lang.Override()
    public void showArticleList(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.androidproject.data.network.model.ResultData> articles) {
    }
    
    public MainActivity() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/androidproject/ui/main/view/MainActivity$Companion;", "", "()V", "getStartIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final android.content.Intent getStartIntent(@org.jetbrains.annotations.NotNull()
        android.content.Context context) {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}