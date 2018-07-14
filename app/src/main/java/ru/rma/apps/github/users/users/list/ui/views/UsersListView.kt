package ru.rma.apps.github.users.users.list.ui.views

import ru.rma.apps.github.users.core.ui.models.UserModel
import ru.rma.apps.github.users.core.ui.views.BaseView

interface UsersListView : BaseView {

    fun showUsers(list: List<UserModel>)
}