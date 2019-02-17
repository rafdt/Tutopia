package com.raywenderlich.android.whysoserious.ui.jokes.all.list;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u00a2\u0006\u0002\u0010\u0007J\u000e\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\u0005J\u0018\u0010\u0014\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u0002J\b\u0010\u0018\u001a\u00020\rH\u0016J\u0018\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0018\u0010\u001b\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\rH\u0016J\u0014\u0010\u001f\u001a\u00020\u00062\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\n0!J\u0018\u0010\"\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0002R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/jokes/all/list/JokeAdapter;", "Landroid/support/v7/widget/RecyclerView$Adapter;", "Lcom/raywenderlich/android/whysoserious/ui/jokes/all/list/JokeHolder;", "onFavoriteClickHandler", "Lkotlin/Function1;", "Lcom/raywenderlich/android/whysoserious/model/Joke;", "", "(Lkotlin/jvm/functions/Function1;)V", "favoriteJokesIds", "", "", "items", "numtimes", "", "getNumtimes", "()I", "setNumtimes", "(I)V", "addJoke", "joke", "bmp", "bitmap", "Landroid/graphics/Bitmap;", "holder", "getItemCount", "onBindViewHolder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setFavoriteJokesIds", "ids", "", "setPics", "app_debug"})
public final class JokeAdapter extends android.support.v7.widget.RecyclerView.Adapter<com.raywenderlich.android.whysoserious.ui.jokes.all.list.JokeHolder> {
    private final java.util.List<com.raywenderlich.android.whysoserious.model.Joke> items = null;
    private final java.util.List<java.lang.String> favoriteJokesIds = null;
    private int numtimes;
    private final kotlin.jvm.functions.Function1<com.raywenderlich.android.whysoserious.model.Joke, kotlin.Unit> onFavoriteClickHandler = null;
    
    public final int getNumtimes() {
        return 0;
    }
    
    public final void setNumtimes(int p0) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void setFavoriteJokesIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> ids) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.raywenderlich.android.whysoserious.ui.jokes.all.list.JokeHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.graphics.Bitmap setPics(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.ui.jokes.all.list.JokeHolder holder) {
        return null;
    }
    
    public final void bmp(@org.jetbrains.annotations.Nullable()
    android.graphics.Bitmap bitmap, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.ui.jokes.all.list.JokeHolder holder) {
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.ui.jokes.all.list.JokeHolder holder, int position) {
    }
    
    public final void addJoke(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke) {
    }
    
    public JokeAdapter(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.whysoserious.model.Joke, kotlin.Unit> onFavoriteClickHandler) {
        super();
    }
}