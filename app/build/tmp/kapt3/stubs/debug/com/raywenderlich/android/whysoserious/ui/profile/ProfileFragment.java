package com.raywenderlich.android.whysoserious.ui.profile;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u001f\u001a\u00020\u001aH\u0002J\b\u0010 \u001a\u00020!H\u0002J\"\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J&\u0010\'\u001a\u0004\u0018\u00010(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u001a\u0010/\u001a\u00020!2\u0006\u00100\u001a\u00020(2\b\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0006\u00101\u001a\u00020!J\b\u00102\u001a\u00020!H\u0016J\u0010\u00103\u001a\u00020!2\u0006\u00104\u001a\u00020\u001aH\u0016J\u0010\u00105\u001a\u00020!2\u0006\u00106\u001a\u00020\u0005H\u0016J\u000e\u00107\u001a\u00020!2\u0006\u00108\u001a\u00020\u001aJ\u0010\u00109\u001a\u00020!2\u0006\u0010:\u001a\u00020\u001aH\u0016J\b\u0010;\u001a\u00020!H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006<"}, d2 = {"Lcom/raywenderlich/android/whysoserious/ui/profile/ProfileFragment;", "Landroid/support/v4/app/Fragment;", "Lcom/raywenderlich/android/whysoserious/ui/profile/ProfileView;", "()V", "PICK_IMAGE_REQUEST", "", "database", "Lcom/google/firebase/database/DatabaseReference;", "isChosen", "", "()Z", "setChosen", "(Z)V", "myUri", "Landroid/net/Uri;", "getMyUri", "()Landroid/net/Uri;", "setMyUri", "(Landroid/net/Uri;)V", "presenter", "Lcom/raywenderlich/android/whysoserious/presentation/ProfilePresenter;", "getPresenter", "()Lcom/raywenderlich/android/whysoserious/presentation/ProfilePresenter;", "presenter$delegate", "Lkotlin/Lazy;", "user", "", "getUser", "()Ljava/lang/String;", "setUser", "(Ljava/lang/String;)V", "getFileExtension", "initUi", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openFileChooser", "openWelcome", "showEmail", "email", "showNumberOfJokes", "jokesCount", "showTutor", "tutor", "showUsername", "username", "uploadFile", "app_debug"})
public final class ProfileFragment extends android.support.v4.app.Fragment implements com.raywenderlich.android.whysoserious.ui.profile.ProfileView {
    private final int PICK_IMAGE_REQUEST = 1;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String user;
    private boolean isChosen;
    private com.google.firebase.database.DatabaseReference database;
    @org.jetbrains.annotations.NotNull()
    private android.net.Uri myUri;
    private final kotlin.Lazy presenter$delegate = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean isChosen() {
        return false;
    }
    
    public final void setChosen(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.net.Uri getMyUri() {
        return null;
    }
    
    public final void setMyUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri p0) {
    }
    
    private final java.lang.String getFileExtension() {
        return null;
    }
    
    private final void uploadFile() {
    }
    
    private final com.raywenderlich.android.whysoserious.presentation.ProfilePresenter getPresenter() {
        return null;
    }
    
    public final void openFileChooser() {
    }
    
    @java.lang.Override()
    public void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initUi() {
    }
    
    @java.lang.Override()
    public void showUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    @java.lang.Override()
    public void showEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    @java.lang.Override()
    public void showNumberOfJokes(int jokesCount) {
    }
    
    @java.lang.Override()
    public void openWelcome() {
    }
    
    public final void showTutor(@org.jetbrains.annotations.NotNull()
    java.lang.String tutor) {
    }
    
    public ProfileFragment() {
        super();
    }
}