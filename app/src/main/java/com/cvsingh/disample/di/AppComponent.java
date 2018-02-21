package com.cvsingh.disample.di;

import android.app.Application;

import com.cvsingh.disample.MyApp;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;

/**
 * Created by audax on 01-02-2018.
 */
@Component(modules = {
        AndroidInjectionModule.class,
        AppModule.class,
        BuilderModule.class})
public interface AppComponent {

    @Component.Builder
    interface Builder {

        @BindsInstance
        Builder application(Application application);

        AppComponent build();

    }

    void inject(MyApp app);

}
