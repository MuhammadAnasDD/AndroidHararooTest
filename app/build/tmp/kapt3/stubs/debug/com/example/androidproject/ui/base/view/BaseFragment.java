package com.example.androidproject.ui.base.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\b\u001a\u0004\u0018\u00010\u0005J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0012\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\nH&J\b\u0010\u0016\u001a\u00020\nH\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/androidproject/ui/base/view/BaseFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/example/androidproject/ui/base/view/IView;", "()V", "parentActivity", "Lcom/example/androidproject/ui/base/view/BaseActivity;", "progressDialog", "Landroid/app/ProgressDialog;", "getBaseActivity", "hideProgress", "", "onAttach", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "performDependencyInjection", "setUp", "showProgress", "CallBack", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment implements com.example.androidproject.ui.base.view.IView {
    private com.example.androidproject.ui.base.view.BaseActivity parentActivity;
    private android.app.ProgressDialog progressDialog;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public void onAttach(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void hideProgress() {
    }
    
    @java.lang.Override()
    public void showProgress() {
    }
    
    /**
     * @return the parent activity
     */
    @org.jetbrains.annotations.Nullable()
    public final com.example.androidproject.ui.base.view.BaseActivity getBaseActivity() {
        return null;
    }
    
    /**
     * Performs Injection
     */
    private final void performDependencyInjection() {
    }
    
    public abstract void setUp();
    
    public BaseFragment() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/androidproject/ui/base/view/BaseFragment$CallBack;", "", "onFragmentAttached", "", "tag", "", "onFragmentDetached", "app_debug"})
    public static abstract interface CallBack {
        
        public abstract void onFragmentAttached(@org.jetbrains.annotations.Nullable()
        java.lang.String tag);
        
        public abstract void onFragmentDetached(@org.jetbrains.annotations.NotNull()
        java.lang.String tag);
    }
}