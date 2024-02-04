package com.suretrustapp.suretrust.presentation.auth;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0006J\u000e\u0010+\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0006J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020\u001bH\u0002J\u000e\u0010.\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0006J\u0006\u0010/\u001a\u00020)R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR+\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b!\u0010\r\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010\u000bR+\u0010\"\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b%\u0010\r\u001a\u0004\b#\u0010\u0011\"\u0004\b$\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\'\u00a8\u00060"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/auth/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "(Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;)V", "<set-?>", "", "email", "getEmail", "()Ljava/lang/String;", "setEmail", "(Ljava/lang/String;)V", "email$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/suretrustapp/suretrust/presentation/components/InputErrorType;", "emailError", "getEmailError", "()Lcom/suretrustapp/suretrust/presentation/components/InputErrorType;", "setEmailError", "(Lcom/suretrustapp/suretrust/presentation/components/InputErrorType;)V", "emailError$delegate", "loginAs", "getLoginAs", "setLoginAs", "loginAs$delegate", "loginScreenUiEvents", "Lkotlinx/coroutines/channels/Channel;", "Lcom/suretrustapp/suretrust/presentation/auth/LoginScreenUiEvents;", "getLoginScreenUiEvents", "()Lkotlinx/coroutines/channels/Channel;", "password", "getPassword", "setPassword", "password$delegate", "passwordError", "getPasswordError", "setPasswordError", "passwordError$delegate", "getRepository", "()Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "onEmailChange", "", "newValue", "onLoginAsChange", "onLoginScreenEvent", "event", "onPasswordChange", "onRegisterButtonClicked", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState email$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState password$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState emailError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState passwordError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState loginAs$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.suretrustapp.suretrust.presentation.auth.LoginScreenUiEvents> loginScreenUiEvents = null;
    
    @javax.inject.Inject
    public LoginViewModel(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    private final void setEmail(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    private final void setPassword(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getEmailError() {
        return null;
    }
    
    private final void setEmailError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getPasswordError() {
        return null;
    }
    
    private final void setPasswordError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getLoginAs() {
        return null;
    }
    
    private final void setLoginAs(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.Channel<com.suretrustapp.suretrust.presentation.auth.LoginScreenUiEvents> getLoginScreenUiEvents() {
        return null;
    }
    
    public final void onRegisterButtonClicked() {
    }
    
    public final void onEmailChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onPasswordChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onLoginAsChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    private final void onLoginScreenEvent(com.suretrustapp.suretrust.presentation.auth.LoginScreenUiEvents event) {
    }
}