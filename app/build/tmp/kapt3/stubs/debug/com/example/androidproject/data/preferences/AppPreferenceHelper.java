package com.example.androidproject.data.preferences;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000 \r2\u00020\u0001:\u0001\rB!\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/androidproject/data/preferences/AppPreferenceHelper;", "Lcom/example/androidproject/data/preferences/PreferenceHelper;", "context", "Landroid/content/Context;", "prefFileName", "", "gson", "Lcom/google/gson/Gson;", "(Landroid/content/Context;Ljava/lang/String;Lcom/google/gson/Gson;)V", "mPrefs", "Landroid/content/SharedPreferences;", "clearPreferences", "", "Companion", "app_debug"})
public final class AppPreferenceHelper implements com.example.androidproject.data.preferences.PreferenceHelper {
    private final android.content.SharedPreferences mPrefs = null;
    private final java.lang.String prefFileName = null;
    private final com.google.gson.Gson gson = null;
    public static final com.example.androidproject.data.preferences.AppPreferenceHelper.Companion Companion = null;
    
    @java.lang.Override()
    public void clearPreferences() {
    }
    
    @javax.inject.Inject()
    public AppPreferenceHelper(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    @com.example.androidproject.di.PreferenceInfo()
    java.lang.String prefFileName, @org.jetbrains.annotations.NotNull()
    com.google.gson.Gson gson) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/androidproject/data/preferences/AppPreferenceHelper$Companion;", "", "()V", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}