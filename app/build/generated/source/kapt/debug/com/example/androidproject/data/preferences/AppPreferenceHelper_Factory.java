// Generated by Dagger (https://google.github.io/dagger).
package com.example.androidproject.data.preferences;

import android.content.Context;
import com.google.gson.Gson;
import dagger.internal.Factory;
import javax.inject.Provider;

public final class AppPreferenceHelper_Factory implements Factory<AppPreferenceHelper> {
  private final Provider<Context> contextProvider;

  private final Provider<String> prefFileNameProvider;

  private final Provider<Gson> gsonProvider;

  public AppPreferenceHelper_Factory(
      Provider<Context> contextProvider,
      Provider<String> prefFileNameProvider,
      Provider<Gson> gsonProvider) {
    this.contextProvider = contextProvider;
    this.prefFileNameProvider = prefFileNameProvider;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public AppPreferenceHelper get() {
    return provideInstance(contextProvider, prefFileNameProvider, gsonProvider);
  }

  public static AppPreferenceHelper provideInstance(
      Provider<Context> contextProvider,
      Provider<String> prefFileNameProvider,
      Provider<Gson> gsonProvider) {
    return new AppPreferenceHelper(
        contextProvider.get(), prefFileNameProvider.get(), gsonProvider.get());
  }

  public static AppPreferenceHelper_Factory create(
      Provider<Context> contextProvider,
      Provider<String> prefFileNameProvider,
      Provider<Gson> gsonProvider) {
    return new AppPreferenceHelper_Factory(contextProvider, prefFileNameProvider, gsonProvider);
  }

  public static AppPreferenceHelper newAppPreferenceHelper(
      Context context, String prefFileName, Gson gson) {
    return new AppPreferenceHelper(context, prefFileName, gson);
  }
}
