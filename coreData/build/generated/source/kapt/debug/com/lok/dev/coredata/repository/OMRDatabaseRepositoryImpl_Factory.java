// Generated by Dagger (https://dagger.dev).
package com.lok.dev.coredata.repository;

import com.lok.dev.coredatabase.dao.OMRDao;
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
    "rawtypes"
})
public final class OMRDatabaseRepositoryImpl_Factory implements Factory<OMRDatabaseRepositoryImpl> {
  private final Provider<OMRDao> omrDaoProvider;

  public OMRDatabaseRepositoryImpl_Factory(Provider<OMRDao> omrDaoProvider) {
    this.omrDaoProvider = omrDaoProvider;
  }

  @Override
  public OMRDatabaseRepositoryImpl get() {
    return newInstance(omrDaoProvider.get());
  }

  public static OMRDatabaseRepositoryImpl_Factory create(Provider<OMRDao> omrDaoProvider) {
    return new OMRDatabaseRepositoryImpl_Factory(omrDaoProvider);
  }

  public static OMRDatabaseRepositoryImpl newInstance(OMRDao omrDao) {
    return new OMRDatabaseRepositoryImpl(omrDao);
  }
}