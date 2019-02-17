package com.raywenderlich.android.whysoserious.presentation.implementation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/raywenderlich/android/whysoserious/presentation/implementation/AddJokePresenterImpl;", "Lcom/raywenderlich/android/whysoserious/presentation/AddJokePresenter;", "authenticationInterface", "Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;", "databaseInterface", "Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;", "(Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;)V", "jokeText", "", "view", "Lcom/raywenderlich/android/whysoserious/ui/addJoke/AddJokeView;", "addJokeTapped", "", "onAddJokeResult", "isSuccessful", "", "onJokeTextChanged", "setView", "app_debug"})
public final class AddJokePresenterImpl implements com.raywenderlich.android.whysoserious.presentation.AddJokePresenter {
    private com.raywenderlich.android.whysoserious.ui.addJoke.AddJokeView view;
    private java.lang.String jokeText;
    private final com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface = null;
    private final com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface databaseInterface = null;
    
    @java.lang.Override()
    public void setView(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.ui.addJoke.AddJokeView view) {
    }
    
    @java.lang.Override()
    public void addJokeTapped() {
    }
    
    @java.lang.Override()
    public void onJokeTextChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeText) {
    }
    
    private final void onAddJokeResult(boolean isSuccessful) {
    }
    
    @javax.inject.Inject()
    public AddJokePresenterImpl(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authenticationInterface, @org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface databaseInterface) {
        super();
    }
}