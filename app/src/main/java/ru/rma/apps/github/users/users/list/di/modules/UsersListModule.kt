package ru.rma.apps.github.users.users.list.di.modules

import dagger.Binds
import dagger.Module
import ru.rma.apps.github.users.core.di.scopes.FragmentScope
import ru.rma.apps.github.users.users.list.ui.presenters.UsersListPresenter
import ru.rma.apps.github.users.users.list.ui.presenters.UsersListPresenterImpl
import ru.rma.apps.github.users.users.list.ui.views.UsersListFragment
import ru.rma.apps.github.users.users.list.ui.views.UsersListView

@Module
interface UsersListModule {

    @Binds
    @FragmentScope
    fun usersListView(view: UsersListFragment): UsersListView

    @Binds
    @FragmentScope
    fun usersListPresenter(presenter: UsersListPresenterImpl): UsersListPresenter
}