package com.suretrustapp.suretrust.data.remote;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J+\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J+\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\b\b\u0003\u0010\r\u001a\u00020\u000e2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\u00032\b\b\u0001\u0010\u0016\u001a\u00020\u0017H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J!\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00032\b\b\u0001\u0010\u001b\u001a\u00020\u001cH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001d\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/suretrustapp/suretrust/data/remote/ISureTrustAPI;", "", "getAboutSureTrust", "Lretrofit2/Response;", "", "Lcom/suretrustapp/suretrust/data/remote/models/NoticeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCommunityCount", "Lcom/suretrustapp/suretrust/data/remote/models/CommunityCountResponse;", "getDocuments", "Lcom/suretrustapp/suretrust/data/remote/models/DocumentResponse;", "getMedicalCourse", "Lcom/suretrustapp/suretrust/data/remote/models/CourseResponse;", "category", "", "page", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getNonMedicalCourse", "getNotice", "registerUser", "Lcom/suretrustapp/suretrust/data/remote/models/RegisterResponse;", "registerRequestBody", "Lcom/suretrustapp/suretrust/data/remote/models/RegisterRequestBody;", "(Lcom/suretrustapp/suretrust/data/remote/models/RegisterRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userLogin", "Lcom/suretrustapp/suretrust/data/remote/models/LoginResponse;", "loginBody", "Lcom/suretrustapp/suretrust/data/remote/models/LoginRequestBody;", "(Lcom/suretrustapp/suretrust/data/remote/models/LoginRequestBody;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_release"})
public abstract interface ISureTrustAPI {
    
    @retrofit2.http.POST(value = "users/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object registerUser(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.RegisterRequestBody registerRequestBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.suretrustapp.suretrust.data.remote.models.RegisterResponse>> $completion);
    
    @retrofit2.http.POST(value = "users/get-token/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object userLogin(@retrofit2.http.Body
    @org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.data.remote.models.LoginRequestBody loginBody, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.suretrustapp.suretrust.data.remote.models.LoginResponse>> $completion);
    
    @retrofit2.http.GET(value = "home/notice/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNotice(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.suretrustapp.suretrust.data.remote.models.NoticeResponse>>> $completion);
    
    @retrofit2.http.GET(value = "community/get_count")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getCommunityCount(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.suretrustapp.suretrust.data.remote.models.CommunityCountResponse>> $completion);
    
    @retrofit2.http.GET(value = "home/about-suretrust/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getAboutSureTrust(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<java.util.List<com.suretrustapp.suretrust.data.remote.models.NoticeResponse>>> $completion);
    
    @retrofit2.http.GET(value = "gallery/documents/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getDocuments(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.suretrustapp.suretrust.data.remote.models.DocumentResponse>> $completion);
    
    @retrofit2.http.GET(value = "courses/get_courses_by_param/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getMedicalCourse(@retrofit2.http.Query(value = "category")
    @org.jetbrains.annotations.NotNull
    java.lang.String category, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.suretrustapp.suretrust.data.remote.models.CourseResponse>> $completion);
    
    @retrofit2.http.GET(value = "courses/get_courses_by_param/")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object getNonMedicalCourse(@retrofit2.http.Query(value = "category")
    @org.jetbrains.annotations.NotNull
    java.lang.String category, @retrofit2.http.Query(value = "page")
    int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super retrofit2.Response<com.suretrustapp.suretrust.data.remote.models.CourseResponse>> $completion);
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
    public static final class DefaultImpls {
    }
}