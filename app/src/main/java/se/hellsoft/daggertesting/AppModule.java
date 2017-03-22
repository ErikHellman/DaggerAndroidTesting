package se.hellsoft.daggertesting;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {
  private static final String PREFS_NAME = "app.prefs";
  private Application application;

  public AppModule(Application application) {
    this.application = application;
  }

  @Provides
  public SharedPreferences preferences() {
    return application.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE);
  }
}
