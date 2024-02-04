package com.suretrustapp.suretrust.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J+\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\u0006\u0010\u0011\u001a\u00020\u0012H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J#\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00050\u00040\u0003H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ%\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\u0006\u0010\u0019\u001a\u00020\u001aH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ%\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00040\u00032\u0006\u0010\u0007\u001a\u00020\bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "", "getAboutSureTrust", "Lkotlinx/coroutines/flow/Flow;", "Lcom/suretrustapp/suretrust/domain/StandardResponse;", "", "Lcom/suretrustapp/suretrust/data/remote/models/NoticeResponse;", "loginBody", "Lcom/suretrustapp/suretrust/data/remote/models/LoginRequestBody;", "(Lcom/suretrustapp/suretrust/data/remote/models/LoginRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommunityCount", "Lcom/suretrustapp/suretrust/data/remote/models/CommunityCountResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDocuments", "Lcom/suretrustapp/suretrust/data/remote/models/DocumentResponse;", "getMedicalCourseByPage", "Lcom/suretrustapp/suretrust/data/remote/models/CourseResponse;", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNonMedicalCourseByPage", "getNotice", "Lcom/suretrustapp/suretrust/domain/models/UpdatesAndNewsDTO;", "registerUser", "Lcom/suretrustapp/suretrust/data/remote/models/RegisterResponse;", "registerRequestBody", "Lcom/suretrustapp/suretrust/data/remote/models/RegisterRequestBody;", "(Lcom/suretrustapp/suretrust/data/remote/models/RegisterRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLogin", "Lcom/suretrustapp/suretrust/data/remote/models/LoginResponse;", "app_debug"})
public abstract interface RemoteDataRepository {
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerUser(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.RegisterRequestBody registerRequestBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.RegisterResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object userLogin(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.LoginRequestBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.LoginResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNotice(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<? extends java.util.List<com.suretrustapp.suretrust.domain.models.UpdatesAndNewsDTO>>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCommunityCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.CommunityCountResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAboutSureTrust(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.LoginRequestBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<? extends java.util.List<com.suretrustapp.suretrust.data.remote.models.NoticeResponse>>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDocuments(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.DocumentResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMedicalCourseByPage(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.CourseResponse>>> $completion);
    
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNonMedicalCourseByPage(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.suretrustapp.suretrust.domain.StandardResponse<com.suretrustapp.suretrust.data.remote.models.CourseResponse>>> $completion);
}