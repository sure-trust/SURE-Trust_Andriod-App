package com.suretrustapp.suretrust.di;

import dagger.hilt.InstallIn;
import dagger.hilt.codegen.OriginatingElement;
import dagger.hilt.components.SingletonComponent;
import dagger.hilt.internal.GeneratedEntryPoint;

@OriginatingElement(
    topLevelClass = SureTrustApplication.class
)
@GeneratedEntryPoint
@InstallIn(SingletonComponent.class)
public interface SureTrustApplication_GeneratedInjector {
  void injectSureTrustApplication(SureTrustApplication sureTrustApplication);
}
