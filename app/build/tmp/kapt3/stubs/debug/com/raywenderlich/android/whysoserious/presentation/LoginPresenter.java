package com.raywenderlich.android.whysoserious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\b\u0010\u0007\u001a\u00020\u0004H&J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H&\u00a8\u0006\n"}, d2 = {"Lcom/raywenderlich/android/whysoserious/presentation/LoginPresenter;", "Lcom/raywenderlich/android/whysoserious/presentation/BasePresenter;", "Lcom/raywenderlich/android/whysoserious/ui/login/LoginView;", "onEmailChanged", "", "email", "", "onLoginTapped", "onPasswordChanged", "password", "app_debug"})
public abstract interface LoginPresenter extends com.raywenderlich.android.whysoserious.presentation.BasePresenter<com.raywenderlich.android.whysoserious.ui.login.LoginView> {
    
    public abstract void onLoginTapped();
    
    public abstract void onEmailChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    public abstract void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String password);
}