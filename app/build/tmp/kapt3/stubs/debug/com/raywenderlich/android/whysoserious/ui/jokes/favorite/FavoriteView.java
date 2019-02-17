package com.raywenderlich.android.whysoserious.ui.jokes.favorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0016\u0010\u0005\u001a\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H&J\b\u0010\t\u001a\u00020\u0003H&\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/jokes/favorite/FavoriteView;", "", "clearItems", "", "hideNoDataDescription", "showFavoriteJokes", "jokes", "", "Lcom/raywenderlich/android/whysoserious/model/Joke;", "showNoDataDescription", "app_debug"})
public abstract interface FavoriteView {
    
    public abstract void showFavoriteJokes(@org.jetbrains.annotations.NotNull()
    java.util.List<com.raywenderlich.android.whysoserious.model.Joke> jokes);
    
    public abstract void showNoDataDescription();
    
    public abstract void hideNoDataDescription();
    
    public abstract void clearItems();
}