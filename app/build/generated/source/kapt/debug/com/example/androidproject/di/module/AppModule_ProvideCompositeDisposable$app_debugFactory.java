// Generated by Dagger (https://google.github.io/dagger).
package com.example.androidproject.di.module;

import dagger.internal.Factory;
import dagger.internal.Preconditions;
import io.reactivex.disposables.CompositeDisposable;

public final class AppModule_ProvideCompositeDisposable$app_debugFactory
    implements Factory<CompositeDisposable> {
  private final AppModule module;

  public AppModule_ProvideCompositeDisposable$app_debugFactory(AppModule module) {
    this.module = module;
  }

  @Override
  public CompositeDisposable get() {
    return provideInstance(module);
  }

  public static CompositeDisposable provideInstance(AppModule module) {
    return proxyProvideCompositeDisposable$app_debug(module);
  }

  public static AppModule_ProvideCompositeDisposable$app_debugFactory create(AppModule module) {
    return new AppModule_ProvideCompositeDisposable$app_debugFactory(module);
  }

  public static CompositeDisposable proxyProvideCompositeDisposable$app_debug(AppModule instance) {
    return Preconditions.checkNotNull(
        instance.provideCompositeDisposable$app_debug(),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
