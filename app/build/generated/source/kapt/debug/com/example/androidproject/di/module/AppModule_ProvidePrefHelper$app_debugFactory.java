// Generated by Dagger (https://google.github.io/dagger).
package com.example.androidproject.di.module;

import com.example.androidproject.data.preferences.AppPreferenceHelper;
import com.example.androidproject.data.preferences.PreferenceHelper;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class AppModule_ProvidePrefHelper$app_debugFactory
    implements Factory<PreferenceHelper> {
  private final AppModule module;

  private final Provider<AppPreferenceHelper> appPreferenceHelperProvider;

  public AppModule_ProvidePrefHelper$app_debugFactory(
      AppModule module, Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    this.module = module;
    this.appPreferenceHelperProvider = appPreferenceHelperProvider;
  }

  @Override
  public PreferenceHelper get() {
    return provideInstance(module, appPreferenceHelperProvider);
  }

  public static PreferenceHelper provideInstance(
      AppModule module, Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    return proxyProvidePrefHelper$app_debug(module, appPreferenceHelperProvider.get());
  }

  public static AppModule_ProvidePrefHelper$app_debugFactory create(
      AppModule module, Provider<AppPreferenceHelper> appPreferenceHelperProvider) {
    return new AppModule_ProvidePrefHelper$app_debugFactory(module, appPreferenceHelperProvider);
  }

  public static PreferenceHelper proxyProvidePrefHelper$app_debug(
      AppModule instance, AppPreferenceHelper appPreferenceHelper) {
    return Preconditions.checkNotNull(
        instance.providePrefHelper$app_debug(appPreferenceHelper),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
