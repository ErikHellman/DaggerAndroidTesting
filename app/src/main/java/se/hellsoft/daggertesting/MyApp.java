package se.hellsoft.daggertesting;

import android.app.Activity;
import android.app.Application;
import android.support.v4.app.Fragment;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.HasSupportFragmentInjector;

public class MyApp extends Application implements HasActivityInjector, HasSupportFragmentInjector {
  @Inject
  DispatchingAndroidInjector<Activity> dispatchingActivityInjector;
  @Inject
  DispatchingAndroidInjector<Fragment> dispatchingFragmentInjector;

  @Override
  public void onCreate() {
    super.onCreate();
    DaggerPresenterComponent.builder().build().inject(this);
  }


  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingActivityInjector;
  }

  @Override
  public DispatchingAndroidInjector<Fragment> supportFragmentInjector() {
    return dispatchingFragmentInjector;
  }
}
