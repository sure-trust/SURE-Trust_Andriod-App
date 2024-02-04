package com.suretrustapp.suretrust.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J+\u0010\u0006\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b0\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\b0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001d\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120\b0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J%\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\b0\u00072\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J#\u0010\u0019\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\t0\b0\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J%\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001c0\b0\u00072\u0006\u0010\u001d\u001a\u00020\u001eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ%\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020!0\b0\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\""}, d2 = {"Lcom/suretrustapp/suretrust/data/repository/RemoteDataRepositoryImpl;", "Lcom/suretrustapp/suretrust/data/repository/BaseRemoteDataRepository;", "Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "api", "Lcom/suretrustapp/suretrust/data/remote/ISureTrustAPI;", "(Lcom/suretrustapp/suretrust/data/remote/ISureTrustAPI;)V", "getAboutSureTrust", "Lkotlinx/coroutines/flow/Flow;", "Lcom/suretrustapp/suretrust/domain/StandardResponse;", "", "Lcom/suretrustapp/suretrust/data/remote/models/NoticeResponse;", "loginBody", "Lcom/suretrustapp/suretrust/data/remote/models/LoginRequestBody;", "(Lcom/suretrustapp/suretrust/data/remote/models/LoginRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommunityCount", "Lcom/suretrustapp/suretrust/data/remote/models/CommunityCountResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocuments", "Lcom/suretrustapp/suretrust/data/remote/models/DocumentResponse;", "getMedicalCourseByPage", "Lcom/suretrustapp/suretrust/data/remote/models/CourseResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNonMedicalCourseByPage", "getNotice", "Lcom/suretrustapp/suretrust/domain/models/UpdatesAndNewsDTO;", "registerUser", "Lcom/suretrustapp/suretrust/data/remote/models/RegisterResponse;", "registerRequestBody", "Lcom/suretrustapp/suretrust/data/remote/models/RegisterRequestBody;", "(Lcom/suretrustapp/suretrust/data/remote/models/RegisterRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLogin", "Lcom/suretrustapp/suretrust/data/remote/models/LoginResponse;", "app_debug"})
public final class RemoteDataRepositoryImpl extends com.suretrustapp.suretrust.data.repository.BaseRemoteDataRepository implements com.suretrustapp.suretrust.domain.repository.RemoteDataRepository {
    @org.jetbrains.annotations.NotNull
    private final com.suretrustapp.suretrust.data.remote.ISureTrustAPI api = null;
    
    @javax.inject.Inject
    public RemoteDataRepositoryImpl(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.ISureTrustAPI api) {
        super();
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.RegisterRequestBody registerRequestBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.RegisterResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object userLogin(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.LoginRequestBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.LoginResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getNotice(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<? extends java.util.List<com.suretrustapp.suretrust.domain.models.UpdatesAndNewsDTO>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getCommunityCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.CommunityCountResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getAboutSureTrust(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.LoginRequestBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<? extends java.util.List<com.suretrustapp.suretrust.data.remote.models.NoticeResponse>>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getDocuments(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.DocumentResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getMedicalCourseByPage(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.CourseResponse>>> $completion) {
        return null;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.Nullable
    public java.lang.Object getNonMedicalCourseByPage(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.CourseResponse>>> $completion) {
        return null;
    }
}