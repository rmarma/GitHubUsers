package ru.rma.apps.github.users.core.di.modules

import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import ru.rma.apps.github.users.core.di.scopes.FragmentScope
import ru.rma.apps.github.users.users.list.di.modules.UsersListModule
import ru.rma.apps.github.users.users.list.ui.views.UsersListFragment

@Module(includes = [AndroidSupportInjectionModule::class])
interface FragmentsModule {

    @FragmentScope
    @ContributesAndroidInjector(modules = [UsersListModule::class])
    fun usersListFragment(): UsersListFragment
}