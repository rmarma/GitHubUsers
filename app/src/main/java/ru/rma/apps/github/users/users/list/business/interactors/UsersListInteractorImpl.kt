package ru.rma.apps.github.users.users.list.business.interactors

import io.reactivex.Scheduler
import io.reactivex.Single
import ru.rma.apps.github.users.core.business.mappers.UserMapper
import ru.rma.apps.github.users.core.data.repositories.GitHubRepository
import ru.rma.apps.github.users.core.di.annotations.Io
import ru.rma.apps.github.users.core.di.annotations.Local
import ru.rma.apps.github.users.core.di.annotations.Remote
import ru.rma.apps.github.users.core.di.annotations.Ui
import ru.rma.apps.github.users.core.ui.models.UserModel
import ru.rma.apps.github.users.users.list.business.cache.UsersListCache
import javax.inject.Inject

class UsersListInteractorImpl @Inject constructor(
        @Ui private val mUiScheduler: Scheduler,
        @Io private val mIoScheduler: Scheduler,
        private val mCache: UsersListCache,
        @Remote private val mGitHubRemote: GitHubRepository,
        @Local private val mGitHubLocal: GitHubRepository,
        private val mUserMapper: UserMapper
) : UsersListInteractor {


    override fun users(): Single<List<UserModel>> = mGitHubRemote.users()
            .map { mUserMapper.entitiesToModels(it) }
            .subscribeOn(mIoScheduler)
            .observeOn(mUiScheduler)
}