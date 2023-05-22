package com.example.androidproject.ui.custom;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0015\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\r\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eJ\u000e\u0010\u0010\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eJ\u000e\u0010\u0011\u001a\n \u000f*\u0004\u0018\u00010\u000e0\u000eJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0018\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0016J\u000e\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cJ\u0006\u0010\u001d\u001a\u00020\u0016J\u0006\u0010\u001e\u001a\u00020\u0016J\u000e\u0010\u001f\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000eJ\u000e\u0010!\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010#\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J\u000e\u0010&\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000eJ\u000e\u0010\'\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010(\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J\u000e\u0010)\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u000eJ\u000e\u0010*\u001a\u00020\u00162\u0006\u0010\"\u001a\u00020\bJ\u000e\u0010+\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J\u0016\u0010,\u001a\u00020\u00162\u0006\u0010-\u001a\u00020\b2\u0006\u0010.\u001a\u00020\u001cJ\u000e\u0010/\u001a\u00020\u00162\u0006\u00100\u001a\u00020\bJ\u000e\u00101\u001a\u00020\u00162\u0006\u0010$\u001a\u00020%J\u000e\u00102\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u0013J\u0010\u00103\u001a\u00020\u00162\b\b\u0001\u00104\u001a\u00020\bJ\u0010\u00105\u001a\u00020\u00162\b\b\u0001\u00100\u001a\u00020\bJ\u0006\u00106\u001a\u00020\u0016J\u0006\u00107\u001a\u00020\u0016J\u0006\u00108\u001a\u00020\u0016J\u0006\u00109\u001a\u00020\u0016R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006:"}, d2 = {"Lcom/example/androidproject/ui/custom/CustomToolbar;", "Landroidx/appcompat/widget/Toolbar;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "iconEndVisibility", "", "getIconEndVisibility", "()I", "setIconEndVisibility", "(I)V", "getIconEndImageDrawable", "Landroid/graphics/drawable/Drawable;", "kotlin.jvm.PlatformType", "getIconMidImageDrawable", "getIconStartImageDrawable", "getTitle", "", "title", "hideEndIcon", "", "hideEndTitle", "hideMidIcon", "hideProgressBar", "removeIconEndTint", "bothIcons", "", "removeIconMidTint", "removeIconStartTint", "setIconEndImageDrawable", "drawable", "setIconEndImageResource", "res", "setIconEndOnClickListener", "listener", "Landroid/view/View$OnClickListener;", "setIconMidImageDrawable", "setIconMidImageResource", "setIconMidOnClickListener", "setIconStartImageDrawable", "setIconStartImageResource", "setIconStartOnClickListener", "setIconsTintColor", "color", "allIcons", "setTextColor", "textColor", "setTextEndOnClickListener", "setTitle", "setToolbarBackgroundColor", "backgroundColor", "setToolbarEndTextColor", "showEndIcon", "showEndTitle", "showMidIcon", "showProgressBar", "app_debug"})
public final class CustomToolbar extends androidx.appcompat.widget.Toolbar {
    private int iconEndVisibility = android.view.View.GONE;
    private java.util.HashMap _$_findViewCache;
    
    public final int getIconEndVisibility() {
        return 0;
    }
    
    public final void setIconEndVisibility(int p0) {
    }
    
    public final void hideEndTitle() {
    }
    
    public final void showEndTitle() {
    }
    
    public final void setToolbarBackgroundColor(@androidx.annotation.ColorRes()
    int backgroundColor) {
    }
    
    public final void setToolbarEndTextColor(@androidx.annotation.ColorRes()
    int textColor) {
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String title) {
        return null;
    }
    
    public final void showProgressBar() {
    }
    
    public final void hideProgressBar() {
    }
    
    public final void setTextColor(int textColor) {
    }
    
    public final void setIconStartImageResource(int res) {
    }
    
    public final void setIconStartImageDrawable(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public final android.graphics.drawable.Drawable getIconStartImageDrawable() {
        return null;
    }
    
    public final void setIconEndImageResource(int res) {
    }
    
    public final void setIconMidImageResource(int res) {
    }
    
    public final void setIconMidImageDrawable(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public final android.graphics.drawable.Drawable getIconMidImageDrawable() {
        return null;
    }
    
    public final void setIconEndImageDrawable(@org.jetbrains.annotations.NotNull()
    android.graphics.drawable.Drawable drawable) {
    }
    
    public final android.graphics.drawable.Drawable getIconEndImageDrawable() {
        return null;
    }
    
    public final void setIconsTintColor(int color, boolean allIcons) {
    }
    
    public final void removeIconStartTint() {
    }
    
    public final void removeIconEndTint(boolean bothIcons) {
    }
    
    public final void removeIconMidTint() {
    }
    
    public final void setIconStartOnClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setIconMidOnClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setIconEndOnClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void setTextEndOnClickListener(@org.jetbrains.annotations.NotNull()
    android.view.View.OnClickListener listener) {
    }
    
    public final void hideEndIcon() {
    }
    
    public final void showEndIcon() {
    }
    
    public final void hideMidIcon() {
    }
    
    public final void showMidIcon() {
    }
    
    public CustomToolbar(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    android.util.AttributeSet attrs) {
        super(null);
    }
}