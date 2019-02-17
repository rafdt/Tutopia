package com.raywenderlich.android.whysoserious.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\bH\'\u00a8\u0006\t"}, d2 = {"Lcom/raywenderlich/android/whysoserious/di/module/InteractionModule;", "", "()V", "authentication", "Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationInterface;", "Lcom/raywenderlich/android/whysoserious/firebase/authentication/FirebaseAuthenticationManager;", "database", "Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseInterface;", "Lcom/raywenderlich/android/whysoserious/firebase/database/FirebaseDatabaseManager;", "app_debug"})
@javax.inject.Singleton()
@dagger.Module(includes = {com.raywenderlich.android.whysoserious.di.module.FirebaseModule.class})
public abstract class InteractionModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationInterface authentication(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.authentication.FirebaseAuthenticationManager authentication);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseInterface database(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.firebase.database.FirebaseDatabaseManager database);
    
    public InteractionModule() {
        super();
    }
}