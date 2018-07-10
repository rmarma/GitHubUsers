package ru.rma.apps.github.users.users.list.business.cache

import io.reactivex.Single
import ru.rma.apps.github.users.core.ui.models.UserModel
import javax.inject.Inject

class UsersListCacheImpl @Inject constructor() : UsersListCache {

    private var mUsersList: List<UserModel> = emptyList()


    override fun getUsersList(): List<UserModel> = mUsersList

    override fun setUsersList(list: List<UserModel>) {
        mUsersList = list
    }

    override fun usersList(): Single<List<UserModel>> = Single.just(mUsersList)

}