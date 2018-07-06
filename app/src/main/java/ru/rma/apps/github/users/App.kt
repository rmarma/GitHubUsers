package ru.rma.apps.github.users

import dagger.android.support.DaggerApplication
import ru.rma.apps.github.users.core.di.components.DaggerAppComponent

class App : DaggerApplication() {

    override fun applicationInjector() = DaggerAppComponent.builder().create(this)
}