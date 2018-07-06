package ru.rma.apps.github.users.core.di.modules

import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import ru.rma.apps.github.users.App
import javax.inject.Singleton

@Module(includes = [AndroidSupportInjectionModule::class,
    ActivitiesModule::class])
class AppModule {

    @Provides
    @Singleton
    fun context(app: App) = app.applicationContext
}