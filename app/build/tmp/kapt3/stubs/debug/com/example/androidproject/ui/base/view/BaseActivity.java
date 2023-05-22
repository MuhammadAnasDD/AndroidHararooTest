package com.example.androidproject.ui.base.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0007\u001a\u00020\bH\u0002J\b\u0010\t\u001a\u00020\nH\u0016J\u0012\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u000e\u001a\u00020\nH\u0014J\b\u0010\u000f\u001a\u00020\nH\u0014J\b\u0010\u0010\u001a\u00020\nH\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\b\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/androidproject/ui/base/view/BaseActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/example/androidproject/ui/base/view/IView;", "Lcom/example/androidproject/ui/base/view/BaseFragment$CallBack;", "()V", "progressDialog", "Landroid/app/ProgressDialog;", "canDrawOverlays", "", "hideProgress", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onResume", "onStart", "onStop", "performDI", "showProgress", "app_debug"})
public abstract class BaseActivity extends androidx.appcompat.app.AppCompatActivity implements com.example.androidproject.ui.base.view.IView, com.example.androidproject.ui.base.view.BaseFragment.CallBack {
    private android.app.ProgressDialog progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    /**
     * Hides progress indicator, this method is overridden throughout the app to hide custom loaders
     * and perform appropriate logic when hiding the progress indicator
     */
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    private final boolean canDrawOverlays() {
        return false;
    }
    
    /**
     * Performs injection
     */
    private final void performDI() {
    }
    
    @java.lang.Override()
    public void onStart() {
    }
    
    @java.lang.Override()
    public void onStop() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    public BaseActivity() {
        super();
    }
}