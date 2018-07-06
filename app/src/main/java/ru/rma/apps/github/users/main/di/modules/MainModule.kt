package ru.rma.apps.github.users.main.di.modules

import dagger.Binds
import dagger.Module
import ru.rma.apps.github.users.core.di.scopes.ActivityScope
import ru.rma.apps.github.users.main.ui.views.MainActivity
import ru.rma.apps.github.users.main.ui.views.MainView

@Module
interface MainModule {

    @Binds @ActivityScope fun mainView(view: MainActivity): MainView
}