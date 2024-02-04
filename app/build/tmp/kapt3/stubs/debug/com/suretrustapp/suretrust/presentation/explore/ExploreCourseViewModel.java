package com.suretrustapp.suretrust.presentation.explore;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0010\u0010\u0017\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001b\u001a\u00020\u00182\b\b\u0002\u0010\u0019\u001a\u00020\u001aR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0019\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\r8F\u00a2\u0006\u0006\u001a\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\b0\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/explore/ExploreCourseViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "(Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;)V", "_medCourseState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/suretrustapp/suretrust/data/remote/models/CourseItem;", "_nextState", "", "_nonMedCourseState", "medCourseState", "Lkotlinx/coroutines/flow/StateFlow;", "getMedCourseState", "()Lkotlinx/coroutines/flow/StateFlow;", "medList", "Landroidx/compose/runtime/snapshots/SnapshotStateList;", "nextState", "getNextState", "nonMedCourseState", "getNonMedCourseState", "nonMedList", "getMedCourseByPage", "", "page", "", "getNonMedCourseByPage", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class ExploreCourseViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.suretrustapp.suretrust.data.remote.models.CourseItem> medList = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.snapshots.SnapshotStateList<com.suretrustapp.suretrust.data.remote.models.CourseItem> nonMedList = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.suretrustapp.suretrust.data.remote.models.CourseItem>> _medCourseState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.suretrustapp.suretrust.data.remote.models.CourseItem>> _nonMedCourseState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _nextState = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> nextState = null;
    
    @javax.inject.Inject
    public ExploreCourseViewModel(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.suretrustapp.suretrust.data.remote.models.CourseItem>> getMedCourseState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.suretrustapp.suretrust.data.remote.models.CourseItem>> getNonMedCourseState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getNextState() {
        return null;
    }
    
    public final void getMedCourseByPage(int page) {
    }
    
    public final void getNonMedCourseByPage(int page) {
    }
}