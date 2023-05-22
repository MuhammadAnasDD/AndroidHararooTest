package com.example.androidproject.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/example/androidproject/data/network/ApiEndPoint;", "", "()V", "ENDPOINT_GET_ARTICLE", "", "SERVER_URL", "app_debug"})
public final class ApiEndPoint {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVER_URL = "https://api.nytimes.com/svc/mostpopular/v2/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String ENDPOINT_GET_ARTICLE = "https://api.nytimes.com/svc/mostpopular/v2/mostviewed/all-sections/7.json?api-key=e5nylllpABmvD8hW9KiP4ov8ABySdfei";
    public static final com.example.androidproject.data.network.ApiEndPoint INSTANCE = null;
    
    private ApiEndPoint() {
        super();
    }
}