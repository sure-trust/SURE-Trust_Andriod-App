package com.suretrustapp.suretrust.presentation.home;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0014\u001a\u00020\u0015H\u0002J\u0012\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u0010\u0019\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0018H\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "(Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;)V", "_communityCountLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/suretrustapp/suretrust/presentation/home/CommunityCount;", "_nextMedState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_nextNonMedState", "communityCountLiveData", "Landroidx/lifecycle/LiveData;", "getCommunityCountLiveData", "()Landroidx/lifecycle/LiveData;", "medList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "Lcom/suretrustapp/suretrust/data/remote/models/CourseItem;", "nonMedList", "getCommunityCount", "", "getMedCourseByPage", "page", "", "getNonMedCourseByPage", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.suretrustapp.suretrust.data.remote.models.CourseItem> medList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.suretrustapp.suretrust.data.remote.models.CourseItem> nonMedList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<com.suretrustapp.suretrust.presentation.home.CommunityCount> _communityCountLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<com.suretrustapp.suretrust.presentation.home.CommunityCount> communityCountLiveData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _nextNonMedState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _nextMedState = null;
    
    @javax.inject.Inject
    public HomeViewModel(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<com.suretrustapp.suretrust.presentation.home.CommunityCount> getCommunityCountLiveData() {
        return null;
    }
    
    private final void getCommunityCount() {
    }
    
    private final void getMedCourseByPage(int page) {
    }
    
    private final void getNonMedCourseByPage(int page) {
    }
}