package se.hellsoft.daggertesting;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

@Subcomponent(modules = MainActivityModule.class)
public interface MainActivitySubcomponent extends AndroidInjector<MainActivity> {
  @Subcomponent.Builder
  abstract class Builder extends AndroidInjector.Builder<MainActivity> {}
}
