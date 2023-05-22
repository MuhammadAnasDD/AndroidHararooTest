package com.example.androidproject.ui.main.interactor;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016\u00a8\u0006\u000b"}, d2 = {"Lcom/example/androidproject/ui/main/interactor/MainInteractorImpl;", "Lcom/example/androidproject/ui/base/interactor/BaseInteractorImpl;", "Lcom/example/androidproject/ui/main/interactor/IMainInteractor;", "preferenceHelper", "Lcom/example/androidproject/data/preferences/PreferenceHelper;", "apiHelper", "Lcom/example/androidproject/data/network/ApiHelper;", "(Lcom/example/androidproject/data/preferences/PreferenceHelper;Lcom/example/androidproject/data/network/ApiHelper;)V", "getArticleResponse", "Lio/reactivex/Single;", "Lcom/example/androidproject/data/network/model/ArticleResponse;", "app_debug"})
public final class MainInteractorImpl extends com.example.androidproject.ui.base.interactor.BaseInteractorImpl implements com.example.androidproject.ui.main.interactor.IMainInteractor {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Single<com.example.androidproject.data.network.model.ArticleResponse> getArticleResponse() {
        return null;
    }
    
    @javax.inject.Inject()
    public MainInteractorImpl(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.preferences.PreferenceHelper preferenceHelper, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.network.ApiHelper apiHelper) {
        super(null, null);
    }
}