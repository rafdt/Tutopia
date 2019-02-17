package com.raywenderlich.android.whysoserious.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\u001a\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0001\u001a\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0001\u001a\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0001\u001a\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0001\u001a\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0001\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0003X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"EMAIL_REGEX", "", "MIN_CREDENTIAL_LENGTH", "", "MIN_JOKE_LENGTH", "arePasswordsSame", "", "password", "repeatPassword", "isEmailValid", "email", "isPasswordValid", "isUsernameValid", "username", "isValidJoke", "jokeText", "app_debug"})
public final class ValidationHelpersKt {
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EMAIL_REGEX = "(?:[a-z0-9!#$%&\'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&\'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    public static final int MIN_CREDENTIAL_LENGTH = 6;
    public static final int MIN_JOKE_LENGTH = 10;
    
    public static final boolean isEmailValid(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public static final boolean isPasswordValid(@org.jetbrains.annotations.NotNull()
    java.lang.String password) {
        return false;
    }
    
    public static final boolean isUsernameValid(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return false;
    }
    
    public static final boolean arePasswordsSame(@org.jetbrains.annotations.NotNull()
    java.lang.String password, @org.jetbrains.annotations.NotNull()
    java.lang.String repeatPassword) {
        return false;
    }
    
    public static final boolean isValidJoke(@org.jetbrains.annotations.NotNull()
    java.lang.String jokeText) {
        return false;
    }
}