package com.example.androidproject.data.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0002\u000b\fB\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\r"}, d2 = {"Lcom/example/androidproject/data/network/ApiHeader;", "", "protectedApiHeader", "Lcom/example/androidproject/data/network/ApiHeader$ProtectedApiHeader;", "publicApiHeader", "Lcom/example/androidproject/data/network/ApiHeader$PublicApiHeader;", "(Lcom/example/androidproject/data/network/ApiHeader$ProtectedApiHeader;Lcom/example/androidproject/data/network/ApiHeader$PublicApiHeader;)V", "getProtectedApiHeader$app_debug", "()Lcom/example/androidproject/data/network/ApiHeader$ProtectedApiHeader;", "getPublicApiHeader$app_debug", "()Lcom/example/androidproject/data/network/ApiHeader$PublicApiHeader;", "ProtectedApiHeader", "PublicApiHeader", "app_debug"})
public final class ApiHeader {
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.data.network.ApiHeader.ProtectedApiHeader protectedApiHeader = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.androidproject.data.network.ApiHeader.PublicApiHeader publicApiHeader = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.data.network.ApiHeader.ProtectedApiHeader getProtectedApiHeader$app_debug() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.androidproject.data.network.ApiHeader.PublicApiHeader getPublicApiHeader$app_debug() {
        return null;
    }
    
    @javax.inject.Inject()
    public ApiHeader(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.network.ApiHeader.ProtectedApiHeader protectedApiHeader, @org.jetbrains.annotations.NotNull()
    com.example.androidproject.data.network.ApiHeader.PublicApiHeader publicApiHeader) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/androidproject/data/network/ApiHeader$ProtectedApiHeader;", "", "authToken", "", "(Ljava/lang/String;)V", "getAuthToken", "()Ljava/lang/String;", "app_debug"})
    public static final class ProtectedApiHeader {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Authorization")
        @com.google.gson.annotations.Expose()
        private final java.lang.String authToken = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAuthToken() {
            return null;
        }
        
        @javax.inject.Inject()
        public ProtectedApiHeader(@org.jetbrains.annotations.Nullable()
        java.lang.String authToken) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\u00020\u0001BC\b\u0007\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\tR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b\u00a8\u0006\u0011"}, d2 = {"Lcom/example/androidproject/data/network/ApiHeader$PublicApiHeader;", "", "language", "", "deviceId", "devicePlatform", "appVersion", "apiVersion", "contentType", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getApiVersion", "()Ljava/lang/String;", "getAppVersion", "getContentType", "getDeviceId", "getDevicePlatform", "getLanguage", "app_debug"})
    public static final class PublicApiHeader {
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Accept-Language")
        @com.google.gson.annotations.Expose()
        private final java.lang.String language = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "X-Device-Id")
        @com.google.gson.annotations.Expose()
        private final java.lang.String deviceId = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "X-Device-Platform")
        @com.google.gson.annotations.Expose()
        private final java.lang.String devicePlatform = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "X-App-Version")
        @com.google.gson.annotations.Expose()
        private final java.lang.String appVersion = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "X-API-Version")
        @com.google.gson.annotations.Expose()
        private final java.lang.String apiVersion = null;
        @org.jetbrains.annotations.Nullable()
        @com.google.gson.annotations.SerializedName(value = "Content-Type")
        @com.google.gson.annotations.Expose()
        private final java.lang.String contentType = null;
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getLanguage() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDeviceId() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getDevicePlatform() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getAppVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getApiVersion() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getContentType() {
            return null;
        }
        
        @javax.inject.Inject()
        public PublicApiHeader(@org.jetbrains.annotations.Nullable()
        java.lang.String language, @org.jetbrains.annotations.Nullable()
        java.lang.String deviceId, @org.jetbrains.annotations.Nullable()
        java.lang.String devicePlatform, @org.jetbrains.annotations.Nullable()
        java.lang.String appVersion, @org.jetbrains.annotations.Nullable()
        java.lang.String apiVersion, @org.jetbrains.annotations.Nullable()
        java.lang.String contentType) {
            super();
        }
    }
}