package com.raywenderlich.android.whysoserious.firebase.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J$\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eH\u0016J \u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eH\u0016J*\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\u0018\u0010\t\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0014\u0012\u0004\u0012\u00020\u00060\nH\u0016J$\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00060\nH\u0016J\u001c\u0010\u0017\u001a\u00020\u00062\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseManager;", "Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;", "database", "Lcom/google/firebase/database/FirebaseDatabase;", "(Lcom/google/firebase/database/FirebaseDatabase;)V", "addNewJoke", "", "joke", "Lcom/raywenderlich/android/whysoserious/model/Joke;", "onResult", "Lkotlin/Function1;", "", "changeJokeFavoriteStatus", "userId", "", "createUser", "id", "name", "email", "getFavoriteJokes", "", "getProfile", "Lcom/raywenderlich/android/whysoserious/model/User;", "listenToJokes", "onJokeAdded", "app_debug"})
public final class FirebaseDatabaseManager implements com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface {
    private final com.google.firebase.database.FirebaseDatabase database = null;
    
    @java.lang.Override()
    public void createUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @java.lang.Override()
    public void listenToJokes(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.whysoserious.model.Joke, kotlin.Unit> onJokeAdded) {
    }
    
    @java.lang.Override()
    public void addNewJoke(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult) {
    }
    
    @java.lang.Override()
    public void getFavoriteJokes(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.raywenderlich.android.whysoserious.model.Joke>, kotlin.Unit> onResult) {
    }
    
    @java.lang.Override()
    public void changeJokeFavoriteStatus(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke, @org.jetbrains.annotations.NotNull()
    java.lang.String userId) {
    }
    
    @java.lang.Override()
    public void getProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.whysoserious.model.User, kotlin.Unit> onResult) {
    }
    
    @javax.inject.Inject()
    public FirebaseDatabaseManager(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.FirebaseDatabase database) {
        super();
    }
}