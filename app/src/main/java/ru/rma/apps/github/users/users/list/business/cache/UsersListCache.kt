package ru.rma.apps.github.users.users.list.business.cache

import io.reactivex.Single
import ru.rma.apps.github.users.core.ui.models.UserModel

interface UsersListCache {

    fun getUsersList() : List<UserModel>
    fun setUsersList(list: List<UserModel>)
    fun usersList() : Single<List<UserModel>>
}