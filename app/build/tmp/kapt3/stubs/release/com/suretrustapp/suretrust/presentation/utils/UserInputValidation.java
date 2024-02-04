package com.suretrustapp.suretrust.presentation.utils;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\f"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/utils/UserInputValidation;", "", "()V", "EMAIL_REGEX", "", "NAME_REGEX", "PASSWORD_REGEX", "PHONE_REGEX", "validateField", "Lcom/suretrustapp/suretrust/presentation/components/InputErrorType;", "field", "regex", "app_release"})
public final class UserInputValidation {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String NAME_REGEX = "";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String EMAIL_REGEX = "^(.+)@(\\S+)$";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PHONE_REGEX = "";
    @org.jetbrains.annotations.NotNull
    public static final java.lang.String PASSWORD_REGEX = "^.{6,}$";
    @org.jetbrains.annotations.NotNull
    public static final com.suretrustapp.suretrust.presentation.utils.UserInputValidation INSTANCE = null;
    
    private UserInputValidation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType validateField(@org.jetbrains.annotations.NotNull
    java.lang.String field, @org.jetbrains.annotations.NotNull
    java.lang.String regex) {
        return null;
    }
}