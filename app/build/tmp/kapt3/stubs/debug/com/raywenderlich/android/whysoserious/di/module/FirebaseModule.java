package com.raywenderlich.android.whysoserious.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/raywenderlich/android/whysoserious/di/module/FirebaseModule;", "", "()V", "firebaseAuth", "Lcom/google/firebase/auth/FirebaseAuth;", "firebaseDatabase", "Lcom/google/firebase/database/FirebaseDatabase;", "app_debug"})
@javax.inject.Singleton()
@dagger.Module()
public final class FirebaseModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.firebase.auth.FirebaseAuth firebaseAuth() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final com.google.firebase.database.FirebaseDatabase firebaseDatabase() {
        return null;
    }
    
    public FirebaseModule() {
        super();
    }
}