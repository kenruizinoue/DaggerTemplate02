package com.kenruizinoue.daggertemplate02

import dagger.Module
import dagger.Provides

// used on classes which contains methods annotated with @Provides
@Module
class AppModule {
    // can be used on methods in classes annotated with @Module
    // and is used for methods which provides objects for dependencies injection
    @Provides
    fun providesInfo(): Info {
        return Info("I Love Dagger 2")
    }
}