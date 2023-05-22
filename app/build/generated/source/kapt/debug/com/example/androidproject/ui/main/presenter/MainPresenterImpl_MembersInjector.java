// Generated by Dagger (https://google.github.io/dagger).
package com.example.androidproject.ui.main.presenter;

import com.example.androidproject.ui.base.presenter.BasePresenterImpl_MembersInjector;
import com.example.androidproject.ui.main.interactor.IMainInteractor;
import com.example.androidproject.ui.main.view.IMainView;
import com.google.gson.Gson;
import dagger.MembersInjector;
import javax.inject.Provider;

public final class MainPresenterImpl_MembersInjector<V extends IMainView, I extends IMainInteractor>
    implements MembersInjector<MainPresenterImpl<V, I>> {
  private final Provider<Gson> mGsonProvider;

  public MainPresenterImpl_MembersInjector(Provider<Gson> mGsonProvider) {
    this.mGsonProvider = mGsonProvider;
  }

  public static <V extends IMainView, I extends IMainInteractor>
      MembersInjector<MainPresenterImpl<V, I>> create(Provider<Gson> mGsonProvider) {
    return new MainPresenterImpl_MembersInjector<V, I>(mGsonProvider);
  }

  @Override
  public void injectMembers(MainPresenterImpl<V, I> instance) {
    BasePresenterImpl_MembersInjector.injectMGson(instance, mGsonProvider.get());
  }
}
