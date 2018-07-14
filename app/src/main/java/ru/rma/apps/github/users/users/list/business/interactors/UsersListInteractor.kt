package ru.rma.apps.github.users.users.list.business.interactors

import io.reactivex.Single
import ru.rma.apps.github.users.core.ui.models.UserModel

interface UsersListInteractor {

    fun users() : Single<List<UserModel>>
}