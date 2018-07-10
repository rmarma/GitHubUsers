package ru.rma.apps.github.users.core.di.modules

import dagger.Module
import dagger.Provides
import io.reactivex.Scheduler
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers
import ru.rma.apps.github.users.core.di.annotations.Io
import ru.rma.apps.github.users.core.di.annotations.Ui
import javax.inject.Singleton

@Module
abstract class SchedulersModule {

    @Provides
    @Singleton
    @Ui
    fun uiScheduler(): Scheduler = AndroidSchedulers.mainThread()

    @Provides
    @Singleton
    @Io
    fun ioScheduler(): Scheduler = Schedulers.io()
}