package ru.rma.apps.github.users.users.list.ui.views

import ru.rma.apps.github.users.core.ui.models.UserModel

class UsersListViewEmpty : UsersListView {

    override fun showUsers(list: List<UserModel>) {
        // to do nothing
    }
}