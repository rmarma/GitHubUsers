package ru.rma.apps.github.users.core.data.repositories

import io.reactivex.Single
import ru.rma.apps.github.users.core.data.entities.UserEntity
import ru.rma.apps.github.users.core.data.net.GitHubApi
import javax.inject.Inject

class GitHubRepositoryRemote @Inject constructor(
        private val mGitHubApi: GitHubApi
) : GitHubRepository {


    override fun users(): Single<List<UserEntity>> {
        return mGitHubApi.users()
    }
}