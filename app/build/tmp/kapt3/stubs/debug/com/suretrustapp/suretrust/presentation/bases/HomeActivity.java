package com.suretrustapp.suretrust.presentation.bases;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0018\u0010\f\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u000e\u001a\u00020\rH\u0002J\u0012\u0010\u000f\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\rH\u0014J\b\u0010\u0013\u001a\u00020\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00048F\u00a2\u0006\u0006\u001a\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/bases/HomeActivity;", "Lcom/suretrustapp/suretrust/presentation/bases/BaseActivity;", "()V", "_binding", "Lcom/suretrustapp/suretrust/databinding/ActivityHomeBinding;", "appBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "binding", "getBinding", "()Lcom/suretrustapp/suretrust/databinding/ActivityHomeBinding;", "navController", "Landroidx/navigation/NavController;", "handleManualNavigationClicks", "", "manipulateMenus", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onSupportNavigateUp", "", "app_debug"})
public final class HomeActivity extends com.suretrustapp.suretrust.presentation.bases.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private com.suretrustapp.suretrust.databinding.ActivityHomeBinding _binding;
    private androidx.navigation.NavController navController;
    private androidx.navigation.ui.AppBarConfiguration appBarConfiguration;
    
    public HomeActivity() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.databinding.ActivityHomeBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void manipulateMenus() {
    }
    
    @java.lang.Override
    public boolean onSupportNavigateUp() {
        return false;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    private final void handleManualNavigationClicks(androidx.navigation.NavController navController, androidx.navigation.ui.AppBarConfiguration appBarConfiguration) {
    }
}