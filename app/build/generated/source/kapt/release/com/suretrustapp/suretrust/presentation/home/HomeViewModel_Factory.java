// Generated by Dagger (https://dagger.dev).
package com.suretrustapp.suretrust.presentation.home;

import com.suretrustapp.suretrust.domain.repository.RemoteDataRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class HomeViewModel_Factory implements Factory<HomeViewModel> {
  private final Provider<RemoteDataRepository> repoProvider;

  public HomeViewModel_Factory(Provider<RemoteDataRepository> repoProvider) {
    this.repoProvider = repoProvider;
  }

  @Override
  public HomeViewModel get() {
    return newInstance(repoProvider.get());
  }

  public static HomeViewModel_Factory create(Provider<RemoteDataRepository> repoProvider) {
    return new HomeViewModel_Factory(repoProvider);
  }

  public static HomeViewModel newInstance(RemoteDataRepository repo) {
    return new HomeViewModel(repo);
  }
}
