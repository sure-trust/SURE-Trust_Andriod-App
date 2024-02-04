package com.suretrustapp.suretrust.domain;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002:\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t\u00a8\u0006\n"}, d2 = {"Lcom/suretrustapp/suretrust/domain/StandardResponse;", "T", "", "()V", "Failed", "Loading", "Success", "Lcom/suretrustapp/suretrust/domain/StandardResponse$Failed;", "Lcom/suretrustapp/suretrust/domain/StandardResponse$Loading;", "Lcom/suretrustapp/suretrust/domain/StandardResponse$Success;", "app_release"})
public abstract class StandardResponse<T extends java.lang.Object> {
    
    private StandardResponse() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/suretrustapp/suretrust/domain/StandardResponse$Failed;", "Lcom/suretrustapp/suretrust/domain/StandardResponse;", "", "error", "", "(Ljava/lang/String;)V", "getError", "()Ljava/lang/String;", "app_release"})
    public static final class Failed extends com.suretrustapp.suretrust.domain.StandardResponse {
        @org.jetbrains.annotations.NotNull
        private final java.lang.String error = null;
        
        public Failed(@org.jetbrains.annotations.NotNull
        java.lang.String error) {
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String getError() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010\b\u001a\u00020\tH\u00d6\u0001J\t\u0010\n\u001a\u00020\u000bH\u00d6\u0001\u00a8\u0006\f"}, d2 = {"Lcom/suretrustapp/suretrust/domain/StandardResponse$Loading;", "Lcom/suretrustapp/suretrust/domain/StandardResponse;", "", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "app_release"})
    public static final class Loading extends com.suretrustapp.suretrust.domain.StandardResponse {
        @org.jetbrains.annotations.NotNull
        public static final com.suretrustapp.suretrust.domain.StandardResponse.Loading INSTANCE = null;
        
        private Loading() {
        }
        
        @java.lang.Override
        public boolean equals(@org.jetbrains.annotations.Nullable
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u0004R\u0013\u0010\u0003\u001a\u00028\u0001\u00a2\u0006\n\n\u0002\u0010\u0007\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\b"}, d2 = {"Lcom/suretrustapp/suretrust/domain/StandardResponse$Success;", "T", "Lcom/suretrustapp/suretrust/domain/StandardResponse;", "data", "(Ljava/lang/Object;)V", "getData", "()Ljava/lang/Object;", "Ljava/lang/Object;", "app_release"})
    public static final class Success<T extends java.lang.Object> extends com.suretrustapp.suretrust.domain.StandardResponse<T> {
        private final T data = null;
        
        public Success(T data) {
        }
        
        public final T getData() {
            return null;
        }
    }
}