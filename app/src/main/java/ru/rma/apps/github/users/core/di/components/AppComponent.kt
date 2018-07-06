package ru.rma.apps.github.users.core.di.components

import dagger.Component
import dagger.android.AndroidInjector
import ru.rma.apps.github.users.App
import ru.rma.apps.github.users.core.di.modules.AppModule
import javax.inject.Singleton

@Component(modules = [AppModule::class])
@Singleton
interface AppComponent : AndroidInjector<App> {

    @Component.Builder
    abstract class Builder : AndroidInjector.Builder<App>()
}