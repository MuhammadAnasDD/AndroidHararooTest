package com.example.androidproject.ui.main.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0013B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\u0002\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u001c\u0010\u000b\u001a\u00020\f2\n\u0010\r\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u001c\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0014"}, d2 = {"Lcom/example/androidproject/ui/main/adapter/ArticlesItemsAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/androidproject/ui/main/adapter/ArticlesItemsAdapter$ItemVH;", "mItems", "", "Lcom/example/androidproject/data/network/model/ResultData;", "(Ljava/util/List;)V", "getMItems", "()Ljava/util/List;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ItemVH", "app_debug"})
public final class ArticlesItemsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.androidproject.ui.main.adapter.ArticlesItemsAdapter.ItemVH> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.androidproject.data.network.model.ResultData> mItems = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.example.androidproject.ui.main.adapter.ArticlesItemsAdapter.ItemVH onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.androidproject.ui.main.adapter.ArticlesItemsAdapter.ItemVH holder, int position) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.androidproject.data.network.model.ResultData> getMItems() {
        return null;
    }
    
    public ArticlesItemsAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.androidproject.data.network.model.ResultData> mItems) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lcom/example/androidproject/ui/main/adapter/ArticlesItemsAdapter$ItemVH;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "view", "Landroid/view/View;", "(Lcom/example/androidproject/ui/main/adapter/ArticlesItemsAdapter;Landroid/view/View;)V", "onBind", "", "data", "Lcom/example/androidproject/data/network/model/ResultData;", "app_debug"})
    public final class ItemVH extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void onBind(@org.jetbrains.annotations.NotNull()
        com.example.androidproject.data.network.model.ResultData data) {
        }
        
        public ItemVH(@org.jetbrains.annotations.NotNull()
        android.view.View view) {
            super(null);
        }
    }
}