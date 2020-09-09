package com.kenruizinoue.daggertemplate02

import dagger.Component

@Component(modules = [AppModule::class])
interface AppComponent {
    fun inject(app: MainActivity)
}