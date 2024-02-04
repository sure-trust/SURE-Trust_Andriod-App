package com.suretrustapp.suretrust.presentation.helper_screens;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\fH\u0014J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/helper_screens/WebViewActivity;", "Lcom/suretrustapp/suretrust/presentation/bases/BaseActivity;", "()V", "_binding", "Lcom/suretrustapp/suretrust/databinding/ActivityWebViewBinding;", "binding", "getBinding", "()Lcom/suretrustapp/suretrust/databinding/ActivityWebViewBinding;", "browserUrl", "", "screenTitle", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "Companion", "app_release"})
@android.annotation.SuppressLint(value = {"SetJavaScriptEnabled"})
public final class WebViewActivity extends com.suretrustapp.suretrust.presentation.bases.BaseActivity {
    @org.jetbrains.annotations.Nullable
    private java.lang.String browserUrl;
    @org.jetbrains.annotations.Nullable
    private java.lang.String screenTitle;
    @org.jetbrains.annotations.Nullable
    private com.suretrustapp.suretrust.databinding.ActivityWebViewBinding _binding;
    @org.jetbrains.annotations.NotNull
    public static final com.suretrustapp.suretrust.presentation.helper_screens.WebViewActivity.Companion Companion = null;
    
    public WebViewActivity() {
        super();
    }
    
    private final com.suretrustapp.suretrust.databinding.ActivityWebViewBinding getBinding() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.NotNull
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override
    protected void onDestroy() {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u001e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b\u00a8\u0006\n"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/helper_screens/WebViewActivity$Companion;", "", "()V", "openWebView", "", "context", "Landroid/content/Context;", "url", "", "title", "app_release"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        public final void openWebView(@org.jetbrains.annotations.NotNull
        android.content.Context context, @org.jetbrains.annotations.NotNull
        java.lang.String url, @org.jetbrains.annotations.NotNull
        java.lang.String title) {
        }
    }
}