package com.example.androidproject.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0001\u00a2\u0006\u0002\b\u0007J\r\u0010\b\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b\nJ\r\u0010\u000b\u001a\u00020\fH\u0001\u00a2\u0006\u0002\b\rJ\u0015\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\b\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0007J\u0015\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0001\u00a2\u0006\u0002\b\u0019J\u001f\u0010\u001a\u001a\u00020\u001b2\b\b\u0001\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u0016H\u0001\u00a2\u0006\u0002\b\u001eJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010\u0010\u001a\u00020\u0011H\u0001\u00a2\u0006\u0002\b!J\r\u0010\"\u001a\u00020#H\u0001\u00a2\u0006\u0002\b$J\r\u0010%\u001a\u00020\tH\u0001\u00a2\u0006\u0002\b&\u00a8\u0006\'"}, d2 = {"Lcom/example/androidproject/di/module/AppModule;", "", "()V", "provideApiHelper", "Lcom/example/androidproject/data/network/ApiHelper;", "appApiHelper", "Lcom/example/androidproject/data/network/AppApiHelper;", "provideApiHelper$app_debug", "provideApiKey", "", "provideApiKey$app_debug", "provideCompositeDisposable", "Lio/reactivex/disposables/CompositeDisposable;", "provideCompositeDisposable$app_debug", "provideContext", "Landroid/content/Context;", "application", "Landroid/app/Application;", "provideContext$app_debug", "provideGson", "Lcom/google/gson/Gson;", "providePrefHelper", "Lcom/example/androidproject/data/preferences/PreferenceHelper;", "appPreferenceHelper", "Lcom/example/androidproject/data/preferences/AppPreferenceHelper;", "providePrefHelper$app_debug", "provideProtectedApiHeader", "Lcom/example/androidproject/data/network/ApiHeader$ProtectedApiHeader;", "apiKey", "preferenceHelper", "provideProtectedApiHeader$app_debug", "providePublicApiHeader", "Lcom/example/androidproject/data/network/ApiHeader$PublicApiHeader;", "providePublicApiHeader$app_debug", "provideSchedulerProvider", "Lcom/example/androidproject/util/SchedulerProvider;", "provideSchedulerProvider$app_debug", "provideprefFileName", "provideprefFileName$app_debug", "app_debug"})
@dagger.Module()
public final class AppModule {
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final android.content.Context provideContext$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.androidproject.di.ApiKeyInfo()
    @dagger.Provides()
    public final java.lang.String provideApiKey$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @com.example.androidproject.di.PreferenceInfo()
    @dagger.Provides()
    public final java.lang.String provideprefFileName$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.example.androidproject.data.preferences.PreferenceHelper providePrefHelper$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.preferences.AppPreferenceHelper appPreferenceHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.androidproject.data.network.ApiHeader.ProtectedApiHeader provideProtectedApiHeader$app_debug(@org.jetbrains.annotations.NotNull()
    @com.example.androidproject.di.ApiKeyInfo()
    java.lang.String apiKey, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.preferences.PreferenceHelper preferenceHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"HardwareIds"})
    @dagger.Provides()
    public final com.example.androidproject.data.network.ApiHeader.PublicApiHeader providePublicApiHeader$app_debug(@org.jetbrains.annotations.NotNull()
    android.app.Application application) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.google.gson.Gson provideGson() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.androidproject.data.network.ApiHelper provideApiHelper$app_debug(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.network.AppApiHelper appApiHelper) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final io.reactivex.disposables.CompositeDisposable provideCompositeDisposable$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.example.androidproject.util.SchedulerProvider provideSchedulerProvider$app_debug() {
        return null;
    }
    
    public AppModule() {
        super();
    }
}