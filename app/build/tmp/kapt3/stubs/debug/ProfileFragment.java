
import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 9}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u001e\u001a\u00020\u0019H\u0002J\b\u0010\u001f\u001a\u00020 H\u0002J\"\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\u00042\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J&\u0010&\u001a\u0004\u0018\u00010\'2\u0006\u0010(\u001a\u00020)2\b\u0010*\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u001a\u0010.\u001a\u00020 2\u0006\u0010/\u001a\u00020\'2\b\u0010,\u001a\u0004\u0018\u00010-H\u0016J\u0006\u00100\u001a\u00020 J\b\u00101\u001a\u00020 H\u0016J\u0010\u00102\u001a\u00020 2\u0006\u00103\u001a\u00020\u0019H\u0016J\u0010\u00104\u001a\u00020 2\u0006\u00105\u001a\u00020\u0004H\u0016J\u000e\u00106\u001a\u00020 2\u0006\u00107\u001a\u00020\u0019J\u0010\u00108\u001a\u00020 2\u0006\u00109\u001a\u00020\u0019H\u0016J\b\u0010:\u001a\u00020 H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006;"}, d2 = {"LProfileFragment;", "Landroid/support/v4/app/Fragment;", "()V", "PICK_IMAGE_REQUEST", "", "database", "Lcom/google/firebase/database/DatabaseReference;", "isChosen", "", "()Z", "setChosen", "(Z)V", "myUri", "Landroid/net/Uri;", "getMyUri", "()Landroid/net/Uri;", "setMyUri", "(Landroid/net/Uri;)V", "presenter", "Lcom/raywenderlich/android/whysoserious/presentation/ProfilePresenter;", "getPresenter", "()Lcom/raywenderlich/android/whysoserious/presentation/ProfilePresenter;", "presenter$delegate", "Lkotlin/Lazy;", "user", "", "getUser", "()Ljava/lang/String;", "setUser", "(Ljava/lang/String;)V", "getFileExtension", "initUi", "", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "openFileChooser", "openWelcome", "showEmail", "email", "showNumberOfJokes", "jokesCount", "showTutor", "tutor", "showUsername", "username", "uploadFile", "app_debug"})
public final class ProfileFragment extends android.support.v4.app.Fragment {
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
    
    public void showUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
    }
    
    public void showEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
    }
    
    public void showNumberOfJokes(int jokesCount) {
    }
    
    public void openWelcome() {
    }
    
    public final void showTutor(@org.jetbrains.annotations.NotNull()
    java.lang.String tutor) {
    }
    
    public ProfileFragment() {
        super();
    }
}