package com.example.androidproject.ui.base.view;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0005J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0006"}, d2 = {"Lcom/example/androidproject/ui/base/view/IView;", "", "hideProgress", "", "showProgress", "Status", "app_debug"})
public abstract interface IView {
    
    public abstract void showProgress();
    
    public abstract void hideProgress();
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0006"}, d2 = {"Lcom/example/androidproject/ui/base/view/IView$Status;", "", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "NOTIFICATION", "app_debug"})
    public static enum Status {
        /*public static final*/ SUCCESS /* = new SUCCESS() */,
        /*public static final*/ ERROR /* = new ERROR() */,
        /*public static final*/ NOTIFICATION /* = new NOTIFICATION() */;
        
        Status() {
        }
    }
}