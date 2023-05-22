package com.example.androidproject.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000e"}, d2 = {"Lcom/example/androidproject/data/network/AppApiHelper;", "Lcom/example/androidproject/data/network/ApiHelper;", "apiHeader", "Lcom/example/androidproject/data/network/ApiHeader;", "(Lcom/example/androidproject/data/network/ApiHeader;)V", "mGson", "Lcom/google/gson/Gson;", "getMGson", "()Lcom/google/gson/Gson;", "setMGson", "(Lcom/google/gson/Gson;)V", "getArticles", "Lio/reactivex/Single;", "Lcom/example/androidproject/data/network/model/ArticleResponse;", "app_debug"})
public final class AppApiHelper implements com.example.androidproject.data.network.ApiHelper {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.google.gson.Gson mGson;
    private final com.example.androidproject.data.network.ApiHeader apiHeader = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getMGson() {
        return null;
    }
    
    public final void setMGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.androidproject.data.network.model.ArticleResponse> getArticles() {
        return null;
    }
    
    @javax.inject.Inject()
    public AppApiHelper(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.network.ApiHeader apiHeader) {
        super();
    }
}