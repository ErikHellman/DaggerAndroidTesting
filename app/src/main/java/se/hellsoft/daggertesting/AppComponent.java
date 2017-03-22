package se.hellsoft.daggertesting;

import dagger.Component;
import dagger.android.AndroidInjectionModule;

@Component(modules = {AppModule.class, AndroidInjectionModule.class, MainActivityModule.class})
public interface AppComponent {
  void inject(MainActivity mainActivity);
}
