package com.raywenderlich.android.whysoserious.ui.jokes.all;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0010H\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u0016\u0010\u001f\u001a\u00020\u00102\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\"0!H\u0016J\b\u0010#\u001a\u00020\u0010H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006$"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/jokes/all/AllJokesFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/raywenderlich/android/whysoserious/ui/jokes/all/AllJokesView;", "()V", "adapter", "Lcom/raywenderlich/android/whysoserious/ui/jokes/all/list/JokeAdapter;", "getAdapter", "()Lcom/raywenderlich/android/whysoserious/ui/jokes/all/list/JokeAdapter;", "adapter$delegate", "Lkotlin/Lazy;", "presenter", "Lcom/raywenderlich/android/whysoserious/presentation/AllJokesPresenter;", "getPresenter", "()Lcom/raywenderlich/android/whysoserious/presentation/AllJokesPresenter;", "presenter$delegate", "addJoke", "", "joke", "Lcom/raywenderlich/android/whysoserious/model/Joke;", "hideNoDataDescription", "initUi", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "setFavoriteJokesIds", "favoriteJokesIds", "", "", "showNoDataDescription", "app_debug"})
public final class AllJokesFragment extends android.support.v4.app.Fragment implements com.raywenderlich.android.whysoserious.ui.jokes.all.AllJokesView {
    private final kotlin.Lazy presenter$delegate = null;
    private final kotlin.Lazy adapter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    private final com.raywenderlich.android.whysoserious.presentation.AllJokesPresenter getPresenter() {
        return null;
    }
    
    private final com.raywenderlich.android.whysoserious.ui.jokes.all.list.JokeAdapter getAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void addJoke(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke) {
    }
    
    private final void initUi() {
    }
    
    @java.lang.Override()
    public void showNoDataDescription() {
    }
    
    @java.lang.Override()
    public void hideNoDataDescription() {
    }
    
    @java.lang.Override()
    public void setFavoriteJokesIds(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> favoriteJokesIds) {
    }
    
    public AllJokesFragment() {
        super();
    }
}