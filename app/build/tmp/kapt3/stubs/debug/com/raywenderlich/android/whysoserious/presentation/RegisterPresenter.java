package com.raywenderlich.android.whysoserious.presentation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0006H&J\b\u0010\t\u001a\u00020\u0004H&J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0006H&J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u0006H&\u00a8\u0006\u000e"}, d2 = {"Lcom/raywenderlich/android/whysoserious/presentation/RegisterPresenter;", "Lcom/raywenderlich/android/whysoserious/presentation/BasePresenter;", "Lcom/raywenderlich/android/whysoserious/ui/register/RegisterView;", "onEmailChanged", "", "email", "", "onPasswordChanged", "password", "onRegisterTapped", "onRepeatPasswordChanged", "repeatPassword", "onUsernameChanged", "username", "app_debug"})
public abstract interface RegisterPresenter extends com.raywenderlich.android.whysoserious.presentation.BasePresenter<com.raywenderlich.android.whysoserious.ui.register.RegisterView> {
    
    public abstract void onUsernameChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract void onEmailChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    public abstract void onPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String password);
    
    public abstract void onRepeatPasswordChanged(@org.jetbrains.annotations.NotNull()
    java.lang.String repeatPassword);
    
    public abstract void onRegisterTapped();
}