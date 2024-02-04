package com.suretrustapp.suretrust.presentation.bases;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0004H\u0016J\u001a\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0016J\u0018\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u000e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u000f\u00a8\u0006\u0012"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/bases/BaseFragment;", "Landroidx/fragment/app/Fragment;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onStart", "onViewCreated", "view", "Landroid/view/View;", "openDialog", "fragment", "Lcom/suretrustapp/suretrust/presentation/bases/BaseDialogFragment;", "tag", "", "openWebBrowser", "url", "app_debug"})
public abstract class BaseFragment extends androidx.fragment.app.Fragment {
    
    public BaseFragment() {
        super();
    }
    
    @java.lang.Override
    public void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public void onStart() {
    }
    
    @java.lang.Override
    public void onViewCreated(@org.jetbrains.annotations.NotNull
    android.view.View view, @org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    public final void openDialog(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.presentation.bases.BaseDialogFragment fragment, @org.jetbrains.annotations.Nullable
    java.lang.String tag) {
    }
    
    public final void openWebBrowser(@org.jetbrains.annotations.NotNull
    java.lang.String url) {
    }
}