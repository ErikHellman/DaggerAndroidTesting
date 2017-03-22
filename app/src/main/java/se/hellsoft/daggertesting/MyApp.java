package se.hellsoft.daggertesting;

import android.app.Activity;
import android.app.Application;

import javax.inject.Inject;

import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasDispatchingActivityInjector;

public class MyApp extends Application implements HasDispatchingActivityInjector {
  @Inject
  DispatchingAndroidInjector<Activity> dispatchingActivityInjector;

  @Override
  public void onCreate() {
    super.onCreate();
  }

  @Override
  public DispatchingAndroidInjector<Activity> activityInjector() {
    return dispatchingActivityInjector;
  }
}
