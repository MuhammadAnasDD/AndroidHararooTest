package com.example.androidproject.ui.base.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006B\u0005\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lcom/example/androidproject/ui/base/interactor/BaseInteractorImpl;", "Lcom/example/androidproject/ui/base/interactor/IInteractor;", "preferenceHelper", "Lcom/example/androidproject/data/preferences/PreferenceHelper;", "apiHelper", "Lcom/example/androidproject/data/network/ApiHelper;", "(Lcom/example/androidproject/data/preferences/PreferenceHelper;Lcom/example/androidproject/data/network/ApiHelper;)V", "()V", "getApiHelper", "()Lcom/example/androidproject/data/network/ApiHelper;", "setApiHelper", "(Lcom/example/androidproject/data/network/ApiHelper;)V", "getPreferenceHelper", "()Lcom/example/androidproject/data/preferences/PreferenceHelper;", "setPreferenceHelper", "(Lcom/example/androidproject/data/preferences/PreferenceHelper;)V", "app_debug"})
public class BaseInteractorImpl implements com.example.androidproject.ui.base.interactor.IInteractor {
    @org.jetbrains.annotations.NotNull()
    protected com.example.androidproject.data.preferences.PreferenceHelper preferenceHelper;
    @org.jetbrains.annotations.NotNull()
    protected com.example.androidproject.data.network.ApiHelper apiHelper;
    
    @org.jetbrains.annotations.NotNull()
    protected final com.example.androidproject.data.preferences.PreferenceHelper getPreferenceHelper() {
        return null;
    }
    
    protected final void setPreferenceHelper(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.preferences.PreferenceHelper p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final com.example.androidproject.data.network.ApiHelper getApiHelper() {
        return null;
    }
    
    protected final void setApiHelper(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.network.ApiHelper p0) {
    }
    
    public BaseInteractorImpl() {
        super();
    }
    
    public BaseInteractorImpl(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.network.ApiHelper apiHelper) {
        super();
    }
}