package com.raywenderlich.android.whysoserious.ui.addJoke;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/addJoke/AddJokeView;", "", "onJokeAdded", "", "removeJokeError", "showAddJokeError", "showJokeError", "app_debug"})
public abstract interface AddJokeView {
    
    public abstract void onJokeAdded();
    
    public abstract void showAddJokeError();
    
    public abstract void showJokeError();
    
    public abstract void removeJokeError();
}