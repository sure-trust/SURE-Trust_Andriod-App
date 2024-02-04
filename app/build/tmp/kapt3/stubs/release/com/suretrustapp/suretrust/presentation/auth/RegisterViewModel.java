package com.suretrustapp.suretrust.presentation.auth;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\'\n\u0002\u0010 \n\u0002\b#\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010h\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010k\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010l\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010m\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010n\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010o\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010p\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010q\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010r\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u000e\u0010s\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006J\u0006\u0010t\u001a\u00020iJ\u0010\u0010u\u001a\u00020i2\u0006\u0010v\u001a\u00020[H\u0002J\u000e\u0010w\u001a\u00020i2\u0006\u0010j\u001a\u00020\u0006R+\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR+\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0014\u0010\r\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R+\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0016\u0010\t\"\u0004\b\u0017\u0010\u000bR+\u0010\u0019\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u001c\u0010\r\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R+\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b \u0010\r\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010\u000bR+\u0010!\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b$\u0010\r\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R+\u0010%\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b(\u0010\r\u001a\u0004\b&\u0010\t\"\u0004\b\'\u0010\u000bR+\u0010)\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b,\u0010\r\u001a\u0004\b*\u0010\u0011\"\u0004\b+\u0010\u0013R+\u0010-\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b0\u0010\r\u001a\u0004\b.\u0010\t\"\u0004\b/\u0010\u000bR+\u00101\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b4\u0010\r\u001a\u0004\b2\u0010\u0011\"\u0004\b3\u0010\u0013R\u0017\u00105\u001a\b\u0012\u0004\u0012\u00020\u000606\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u00108R+\u00109\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b<\u0010\r\u001a\u0004\b:\u0010\t\"\u0004\b;\u0010\u000bR+\u0010=\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b@\u0010\r\u001a\u0004\b>\u0010\u0011\"\u0004\b?\u0010\u0013R+\u0010A\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bD\u0010\r\u001a\u0004\bB\u0010\t\"\u0004\bC\u0010\u000bR+\u0010E\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bH\u0010\r\u001a\u0004\bF\u0010\u0011\"\u0004\bG\u0010\u0013R+\u0010I\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bL\u0010\r\u001a\u0004\bJ\u0010\t\"\u0004\bK\u0010\u000bR+\u0010M\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bP\u0010\r\u001a\u0004\bN\u0010\u0011\"\u0004\bO\u0010\u0013R+\u0010Q\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bT\u0010\r\u001a\u0004\bR\u0010\t\"\u0004\bS\u0010\u000bR+\u0010U\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u000e8F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bX\u0010\r\u001a\u0004\bV\u0010\u0011\"\u0004\bW\u0010\u0013R\u0017\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0Z\u00a2\u0006\b\n\u0000\u001a\u0004\b\\\u0010]R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b^\u0010_R+\u0010`\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@BX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bc\u0010\r\u001a\u0004\ba\u0010\t\"\u0004\bb\u0010\u000bR+\u0010d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00068F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\bg\u0010\r\u001a\u0004\be\u0010\t\"\u0004\bf\u0010\u000b\u00a8\u0006x"}, d2 = {"Lcom/suretrustapp/suretrust/presentation/auth/RegisterViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "(Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;)V", "<set-?>", "", "collegeDist", "getCollegeDist", "()Ljava/lang/String;", "setCollegeDist", "(Ljava/lang/String;)V", "collegeDist$delegate", "Landroidx/compose/runtime/MutableState;", "Lcom/suretrustapp/suretrust/presentation/components/InputErrorType;", "collegeDistError", "getCollegeDistError", "()Lcom/suretrustapp/suretrust/presentation/components/InputErrorType;", "setCollegeDistError", "(Lcom/suretrustapp/suretrust/presentation/components/InputErrorType;)V", "collegeDistError$delegate", "collegeName", "getCollegeName", "setCollegeName", "collegeName$delegate", "collegeNameError", "getCollegeNameError", "setCollegeNameError", "collegeNameError$delegate", "collegePlace", "getCollegePlace", "setCollegePlace", "collegePlace$delegate", "collegePlaceError", "getCollegePlaceError", "setCollegePlaceError", "collegePlaceError$delegate", "collegeState", "getCollegeState", "setCollegeState", "collegeState$delegate", "collegeStateError", "getCollegeStateError", "setCollegeStateError", "collegeStateError$delegate", "email", "getEmail", "setEmail", "email$delegate", "emailError", "getEmailError", "setEmailError", "emailError$delegate", "genders", "", "getGenders", "()Ljava/util/List;", "name", "getName", "setName", "name$delegate", "nameError", "getNameError", "setNameError", "nameError$delegate", "password", "getPassword", "setPassword", "password$delegate", "passwordError", "getPasswordError", "setPasswordError", "passwordError$delegate", "phone", "getPhone", "setPhone", "phone$delegate", "phoneError", "getPhoneError", "setPhoneError", "phoneError$delegate", "qualification", "getQualification", "setQualification", "qualification$delegate", "qualificationError", "getQualificationError", "setQualificationError", "qualificationError$delegate", "registerScreenUiEvents", "Lkotlinx/coroutines/channels/Channel;", "Lcom/suretrustapp/suretrust/presentation/auth/RegisterScreenUiEvents;", "getRegisterScreenUiEvents", "()Lkotlinx/coroutines/channels/Channel;", "getRepository", "()Lcom/suretrustapp/suretrust/domain/repository/RemoteDataRepository;", "selectedCourse", "getSelectedCourse", "setSelectedCourse", "selectedCourse$delegate", "selectedGenderOption", "getSelectedGenderOption", "setSelectedGenderOption", "selectedGenderOption$delegate", "onCollegeDistChange", "", "newValue", "onCollegeNameChange", "onCollegePlaceChange", "onCollegeStateChange", "onCourseChange", "onEmailChange", "onNameChange", "onPasswordChange", "onPhoneChange", "onQualificationChange", "onRegisterButtonClicked", "onRegisterScreenUiEvent", "event", "onSelectedGenderOptionChange", "app_release"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class RegisterViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repository = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.Channel<com.suretrustapp.suretrust.presentation.auth.RegisterScreenUiEvents> registerScreenUiEvents = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState name$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState nameError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState phone$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState phoneError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState qualification$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState qualificationError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState email$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState emailError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState password$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState passwordError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegeName$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegeNameError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegePlace$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegePlaceError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegeDist$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegeDistError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegeState$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState collegeStateError$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedCourse$delegate = null;
    @org.jetbrains.annotations.NotNull
    private final java.util.List<java.lang.String> genders = null;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState selectedGenderOption$delegate = null;
    
    @javax.inject.Inject
    public RegisterViewModel(@org.jetbrains.annotations.NotNull
    com.suretrustapp.suretrust.domain.repository.RemoteDataRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.domain.repository.RemoteDataRepository getRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.Channel<com.suretrustapp.suretrust.presentation.auth.RegisterScreenUiEvents> getRegisterScreenUiEvents() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getName() {
        return null;
    }
    
    private final void setName(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getNameError() {
        return null;
    }
    
    private final void setNameError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPhone() {
        return null;
    }
    
    private final void setPhone(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getPhoneError() {
        return null;
    }
    
    private final void setPhoneError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getQualification() {
        return null;
    }
    
    private final void setQualification(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getQualificationError() {
        return null;
    }
    
    private final void setQualificationError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getEmail() {
        return null;
    }
    
    private final void setEmail(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getEmailError() {
        return null;
    }
    
    private final void setEmailError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPassword() {
        return null;
    }
    
    private final void setPassword(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getPasswordError() {
        return null;
    }
    
    private final void setPasswordError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCollegeName() {
        return null;
    }
    
    private final void setCollegeName(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getCollegeNameError() {
        return null;
    }
    
    private final void setCollegeNameError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCollegePlace() {
        return null;
    }
    
    private final void setCollegePlace(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getCollegePlaceError() {
        return null;
    }
    
    private final void setCollegePlaceError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCollegeDist() {
        return null;
    }
    
    private final void setCollegeDist(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getCollegeDistError() {
        return null;
    }
    
    private final void setCollegeDistError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getCollegeState() {
        return null;
    }
    
    private final void setCollegeState(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.suretrustapp.suretrust.presentation.components.InputErrorType getCollegeStateError() {
        return null;
    }
    
    private final void setCollegeStateError(com.suretrustapp.suretrust.presentation.components.InputErrorType p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedCourse() {
        return null;
    }
    
    private final void setSelectedCourse(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.String> getGenders() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getSelectedGenderOption() {
        return null;
    }
    
    public final void setSelectedGenderOption(@org.jetbrains.annotations.NotNull
    java.lang.String p0) {
    }
    
    public final void onRegisterButtonClicked() {
    }
    
    private final void onRegisterScreenUiEvent(com.suretrustapp.suretrust.presentation.auth.RegisterScreenUiEvents event) {
    }
    
    public final void onEmailChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onPasswordChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onNameChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onPhoneChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onSelectedGenderOptionChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onQualificationChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onCollegeNameChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onCollegePlaceChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onCollegeDistChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onCollegeStateChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
    
    public final void onCourseChange(@org.jetbrains.annotations.NotNull
    java.lang.String newValue) {
    }
}