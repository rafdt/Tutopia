package com.raywenderlich.android.whysoserious.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\'J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\'J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0011H\'J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\'J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0018H\'J\u0010\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cH\'\u00a8\u0006\u001d"}, d2 = {"Lcom/raywenderlich/android/whysoserious/di/module/PresentationModule;", "", "()V", "addJokePresenter", "Lcom/raywenderlich/android/whysoserious/presentation/AddJokePresenter;", "addJokePresenterImpl", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/AddJokePresenterImpl;", "allJokesPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/AllJokesPresenter;", "allJokesPresenterImpl", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/AllJokesPresenterImpl;", "favoriteJokesPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/FavoriteJokesPresenter;", "favoriteJokesPresenterImpl", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/FavoriteJokesPresenterImpl;", "loginPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/LoginPresenter;", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/LoginPresenterImpl;", "profilePresenter", "Lcom/raywenderlich/android/whysoserious/presentation/ProfilePresenter;", "profilePresenterImpl", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/ProfilePresenterImpl;", "registerPresenter", "Lcom/raywenderlich/android/whysoserious/presentation/RegisterPresenter;", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/RegisterPresenterImpl;", "welcomePresenter", "Lcom/raywenderlich/android/whysoserious/presentation/WelcomePresenter;", "welcomePresenterImpl", "Lcom/raywenderlich/android/whysoserious/presentation/implementation/WelcomePresenterImpl;", "app_debug"})
@dagger.Module(includes = {com.raywenderlich.android.whysoserious.di.module.InteractionModule.class})
public abstract class PresentationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.LoginPresenter loginPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.LoginPresenterImpl loginPresenter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.RegisterPresenter registerPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.RegisterPresenterImpl registerPresenter);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.AllJokesPresenter allJokesPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.AllJokesPresenterImpl allJokesPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.FavoriteJokesPresenter favoriteJokesPresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.FavoriteJokesPresenterImpl favoriteJokesPresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.ProfilePresenter profilePresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.ProfilePresenterImpl profilePresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.AddJokePresenter addJokePresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.AddJokePresenterImpl addJokePresenterImpl);
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Binds()
    public abstract com.raywenderlich.android.whysoserious.presentation.WelcomePresenter welcomePresenter(@org.jetbrains.annotations.NotNull()
    com.raywenderlich.android.whysoserious.presentation.implementation.WelcomePresenterImpl welcomePresenterImpl);
    
    public PresentationModule() {
        super();
    }
}