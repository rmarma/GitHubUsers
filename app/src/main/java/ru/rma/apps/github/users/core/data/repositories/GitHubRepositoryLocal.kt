package ru.rma.apps.github.users.core.data.repositories

import io.reactivex.Single
import ru.rma.apps.github.users.core.data.entities.UserEntity
import javax.inject.Inject

class GitHubRepositoryLocal @Inject constructor(

) : GitHubRepository {

    override fun users(): Single<List<UserEntity>> {
        // TODO
        return Single.just(emptyList())
    }
}