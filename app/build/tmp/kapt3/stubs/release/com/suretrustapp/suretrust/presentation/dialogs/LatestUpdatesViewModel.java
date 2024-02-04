package com.suretrustapp.suretrust.presentation.dialogs;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u000e\u001a\u00020\u000fH\u0002R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/dialogs/LatestUpdatesViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "(Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;)V", "_newsData", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/suretrustapp/suretrust/domain/StandardResponse;", "", "Lcom/suretrustapp/suretrust/domain/models/UpdatesAndNewsDTO;", "newsData", "Lkotlinx/coroutines/flow/Flow;", "getNewsData", "()Lkotlinx/coroutines/flow/Flow;", "getNewsUpdates", "", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class LatestUpdatesViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<com.suretrustapp.suretrust.domain.StandardResponse<java.util.List<com.suretrustapp.suretrust.domain.models.UpdatesAndNewsDTO>>> _newsData = null;
    
    @javax.inject.Inject
    public LatestUpdatesViewModel(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<com.suretrustapp.suretrust.domain.StandardResponse<java.util.List<com.suretrustapp.suretrust.domain.models.UpdatesAndNewsDTO>>> getNewsData() {
        return null;
    }
    
    private final void getNewsUpdates() {
    }
}