package com.suretrustapp.suretrust.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002JU\u0010\u0003\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ]\u0010\u0010\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u001c\u0010\f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ]\u0010\u0011\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u00042\u001c\u0010\u0012\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\r2&\u0010\u0013\u001a\"\b\u0001\u0012\b\u0012\u00060\u0015j\u0002`\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0014H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/suretrustapp/suretrust/data/repository/BaseRemoteDataRepository;", "", "()V", "retry", "T", "times", "", "initialDelayMillis", "", "maxDelayMillis", "factor", "", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "(IJJDLkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "retryIO", "safeAPICall", "apiCall", "errorHandler", "Lkotlin/Function2;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract class BaseRemoteDataRepository {
    
    public BaseRemoteDataRepository() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final <T extends java.lang.Object>java.lang.Object retryIO(int times, long initialDelayMillis, long maxDelayMillis, double factor, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
    
    private final <T extends java.lang.Object>java.lang.Object retry(int times, long initialDelayMillis, long maxDelayMillis, double factor, kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> block, kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final <T extends java.lang.Object>java.lang.Object safeAPICall(@org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function1<? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> apiCall, @org.jetbrains.annotations.NotNull
    kotlin.jvm.functions.Function2<? super java.lang.Exception, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> errorHandler, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super T> $completion) {
        return null;
    }
}