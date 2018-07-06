package ru.rma.apps.github.users.core.di.modules

import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.rma.apps.github.users.core.di.scopes.ActivityScope
import ru.rma.apps.github.users.main.di.modules.MainModule
import ru.rma.apps.github.users.main.ui.views.MainActivity

@Module(includes = [AndroidSupportInjectionModule::class])
interface ActivitiesModule {

    @ActivityScope
    @ContributesAndroidInjector(modules = [MainModule::class])
    fun mainActivity(): MainActivity
}