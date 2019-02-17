package com.raywenderlich.android.whysoserious.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0016\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/whysoserious/presentation/implementation/FavoriteJokesPresenterImpl;", "Lcom/raywenderlich/android/whysoserious/presentation/FavoriteJokesPresenter;", "authenticationInterface", "Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;", "databaseInterface", "Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;", "(Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;)V", "view", "Lcom/raywenderlich/android/whysoserious/ui/jokes/favorite/FavoriteView;", "displayItems", "", "items", "", "Lcom/raywenderlich/android/whysoserious/model/Joke;", "getFavoriteJokes", "onFavoriteButtonTapped", "joke", "setView", "app_debug"})
public final class FavoriteJokesPresenterImpl implements com.raywenderlich.android.whysoserious.presentation.FavoriteJokesPresenter {
    private com.raywenderlich.android.whysoserious.ui.jokes.favorite.FavoriteView view;
    private final com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface = null;
    private final com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface databaseInterface = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.ui.jokes.favorite.FavoriteView view) {
    }
    
    @java.lang.Override()
    public void getFavoriteJokes() {
    }
    
    private final void displayItems(java.util.List<com.raywenderlich.android.whysoserious.model.Joke> items) {
    }
    
    @java.lang.Override()
    public void onFavoriteButtonTapped(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke) {
    }
    
    @javax.inject.Inject()
    public FavoriteJokesPresenterImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface databaseInterface) {
        super();
    }
}