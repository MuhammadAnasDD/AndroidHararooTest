package com.example.androidproject;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0016B\u0005\u00a2\u0006\u0002\u0010\u0005J\u000e\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0015H\u0016R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00078\u0000@\u0000X\u0081.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f\u00a8\u0006\u0017"}, d2 = {"Lcom/example/androidproject/AndroidHararooApp;", "Landroid/app/Application;", "Ldagger/android/HasActivityInjector;", "Ldagger/android/HasServiceInjector;", "Landroidx/lifecycle/LifecycleObserver;", "()V", "activityDispatchingAndroidInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroid/app/Activity;", "getActivityDispatchingAndroidInjector$app_debug", "()Ldagger/android/DispatchingAndroidInjector;", "setActivityDispatchingAndroidInjector$app_debug", "(Ldagger/android/DispatchingAndroidInjector;)V", "dispatchingServiceInjector", "Landroid/app/Service;", "getDispatchingServiceInjector$app_debug", "setDispatchingServiceInjector$app_debug", "activityInjector", "onCreate", "", "serviceInjector", "Ldagger/android/AndroidInjector;", "AdjustLifecycleCallbacks", "app_debug"})
public final class AndroidHararooApp extends android.app.Application implements dagger.android.HasActivityInjector, dagger.android.HasServiceInjector, androidx.lifecycle.LifecycleObserver {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityDispatchingAndroidInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<android.app.Service> dispatchingServiceInjector;
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Activity> getActivityDispatchingAndroidInjector$app_debug() {
        return null;
    }
    
    public final void setActivityDispatchingAndroidInjector$app_debug(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Activity> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<android.app.Service> getDispatchingServiceInjector$app_debug() {
        return null;
    }
    
    public final void setDispatchingServiceInjector$app_debug(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<android.app.Service> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<android.app.Activity> activityInjector() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.AndroidInjector<android.app.Service> serviceInjector() {
        return null;
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public AndroidHararooApp() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016\u00a8\u0006\u000f"}, d2 = {"Lcom/example/androidproject/AndroidHararooApp$AdjustLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "()V", "onActivityCreated", "", "p0", "Landroid/app/Activity;", "p1", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "onActivityStarted", "onActivityStopped", "app_debug"})
    static final class AdjustLifecycleCallbacks implements android.app.Application.ActivityLifecycleCallbacks {
        
        @java.lang.Override()
        public void onActivityPaused(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        @java.lang.Override()
        public void onActivityStarted(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        @java.lang.Override()
        public void onActivityDestroyed(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        @java.lang.Override()
        public void onActivitySaveInstanceState(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0, @org.jetbrains.annotations.NotNull()
        android.os.Bundle p1) {
        }
        
        @java.lang.Override()
        public void onActivityStopped(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        @java.lang.Override()
        public void onActivityCreated(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0, @org.jetbrains.annotations.Nullable()
        android.os.Bundle p1) {
        }
        
        @java.lang.Override()
        public void onActivityResumed(@org.jetbrains.annotations.NotNull()
        android.app.Activity p0) {
        }
        
        public AdjustLifecycleCallbacks() {
            super();
        }
    }
}