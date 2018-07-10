package ru.rma.apps.github.users.users.list.di.modules

import dagger.Binds
import dagger.Module
import ru.rma.apps.github.users.core.di.scopes.FragmentScope
import ru.rma.apps.github.users.users.list.business.cache.UsersListCache
import ru.rma.apps.github.users.users.list.business.cache.UsersListCacheImpl
import ru.rma.apps.github.users.users.list.business.interactors.UsersListInteractor
import ru.rma.apps.github.users.users.list.business.interactors.UsersListInteractorImpl
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

    @Binds
    @FragmentScope
    fun usersListInteractor(interactor: UsersListInteractorImpl): UsersListInteractor

    @Binds
    @FragmentScope
    fun usersListCache(cache: UsersListCacheImpl): UsersListCache
}