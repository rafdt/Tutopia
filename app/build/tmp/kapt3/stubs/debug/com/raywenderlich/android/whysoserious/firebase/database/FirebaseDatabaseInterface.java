package com.raywenderlich.android.whysoserious.firebase.database;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J$\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00030\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH&J \u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH&J*\u0010\u0010\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000b2\u0018\u0010\u0006\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0011\u0012\u0004\u0012\u00020\u00030\u0007H&J$\u0010\u0012\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000b2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u0007H&J\u001c\u0010\u0014\u001a\u00020\u00032\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u0007H&\u00a8\u0006\u0016"}, d2 = {"Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;", "", "addNewJoke", "", "joke", "Lcom/raywenderlich/android/whysoserious/model/Joke;", "onResult", "Lkotlin/Function1;", "", "changeJokeFavoriteStatus", "userId", "", "createUser", "id", "name", "email", "getFavoriteJokes", "", "getProfile", "Lcom/raywenderlich/android/whysoserious/model/User;", "listenToJokes", "onJokeAdded", "app_debug"})
public abstract interface FirebaseDatabaseInterface {
    
    public abstract void listenToJokes(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.whysoserious.model.Joke, kotlin.Unit> onJokeAdded);
    
    public abstract void addNewJoke(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> onResult);
    
    public abstract void getFavoriteJokes(@org.jetbrains.annotations.NotNull()
    java.lang.String userId, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.util.List<com.raywenderlich.android.whysoserious.model.Joke>, kotlin.Unit> onResult);
    
    public abstract void changeJokeFavoriteStatus(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.model.Joke joke, @org.jetbrains.annotations.NotNull()
    java.lang.String userId);
    
    public abstract void createUser(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    public abstract void getProfile(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.raywenderlich.android.whysoserious.model.User, kotlin.Unit> onResult);
}