package se.hellsoft.daggertesting;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Component;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjectionModule;
import dagger.android.ContributesAndroidInjector;

@Component(modules = {PresenterComponent.PresentersModule.class, AndroidInjectionModule.class})
public interface PresenterComponent {
  void inject(MyApp myApp);

  @Module(includes = AndroidBindingModule.class)
  class PresentersModule {
    @Provides
    StartPresenter startPresenter() {
      return new StartPresenterImpl();
    }
  }

  @Module
  abstract class AndroidBindingModule {
    @ContributesAndroidInjector
    abstract MainActivity contributeMainActivityInjector();
    @ContributesAndroidInjector
    abstract StartFragment contributeStartFragmentInjector();
  }

}
