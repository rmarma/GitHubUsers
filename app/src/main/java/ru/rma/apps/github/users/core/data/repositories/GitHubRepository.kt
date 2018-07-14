package ru.rma.apps.github.users.core.data.repositories

import io.reactivex.Single
import ru.rma.apps.github.users.core.data.entities.UserEntity

interface GitHubRepository {

    fun users() : Single<List<UserEntity>>
}