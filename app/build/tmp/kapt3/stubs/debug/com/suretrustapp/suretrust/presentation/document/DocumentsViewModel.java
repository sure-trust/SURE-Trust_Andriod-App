package com.suretrustapp.suretrust.presentation.document;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\n8F\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/document/DocumentsViewModel;", "Landroidx/lifecycle/ViewModel;", "repo", "Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "(Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;)V", "_documentsState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/suretrustapp/suretrust/data/remote/models/Document;", "documentsState", "Lkotlinx/coroutines/flow/StateFlow;", "getDocumentsState", "()Lkotlinx/coroutines/flow/StateFlow;", "getDocuments", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class DocumentsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.suretrustapp.suretrust.data.remote.models.Document>> _documentsState = null;
    
    @javax.inject.Inject
    public DocumentsViewModel(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.suretrustapp.suretrust.data.remote.models.Document>> getDocumentsState() {
        return null;
    }
    
    private final void getDocuments() {
    }
}