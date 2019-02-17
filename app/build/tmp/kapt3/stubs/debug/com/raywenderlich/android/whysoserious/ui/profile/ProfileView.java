package com.raywenderlich.android.whysoserious.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0006H&\u00a8\u0006\f"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/profile/ProfileView;", "", "openWelcome", "", "showEmail", "email", "", "showNumberOfJokes", "jokesCount", "", "showUsername", "username", "app_debug"})
public abstract interface ProfileView {
    
    public abstract void showUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username);
    
    public abstract void showEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    public abstract void showNumberOfJokes(int jokesCount);
    
    public abstract void openWelcome();
}