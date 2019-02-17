package com.raywenderlich.android.whysoserious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lcom/raywenderlich/android/whysoserious/presentation/AddJokePresenter;", "Lcom/raywenderlich/android/whysoserious/presentation/BasePresenter;", "Lcom/raywenderlich/android/whysoserious/ui/addJoke/AddJokeView;", "addJokeTapped", "", "onJokeTextChanged", "jokeText", "", "app_debug"})
public abstract interface AddJokePresenter extends com.raywenderlich.android.whysoserious.presentation.BasePresenter<com.raywenderlich.android.whysoserious.ui.addJoke.AddJokeView> {
    
    public abstract void addJokeTapped();
    
    public abstract void onJokeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeText);
}