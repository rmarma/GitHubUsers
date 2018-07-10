package ru.rma.apps.github.users.users.list.business.interactors

import io.reactivex.Scheduler
import ru.rma.apps.github.users.core.di.annotations.Io
import ru.rma.apps.github.users.core.di.annotations.Ui
import ru.rma.apps.github.users.users.list.business.cache.UsersListCache
import javax.inject.Inject

class UsersListInteractorImpl @Inject constructor(
        @Ui private val mUiScheduler: Scheduler,
        @Io private val mIoScheduler: Scheduler,
        private val mCache: UsersListCache
) : UsersListInteractor {


}