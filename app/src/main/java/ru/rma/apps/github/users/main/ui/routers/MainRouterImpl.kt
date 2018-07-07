package ru.rma.apps.github.users.main.ui.routers

import ru.rma.apps.github.users.R
import ru.rma.apps.github.users.core.ui.routers.BaseRouterActivity
import ru.rma.apps.github.users.main.ui.views.MainActivity
import ru.rma.apps.github.users.users.list.ui.views.UsersListFragment
import javax.inject.Inject

class MainRouterImpl @Inject constructor(
        activity: MainActivity
) : BaseRouterActivity<MainActivity>(activity), MainRouter {

    override fun addUsersList() {
        addFragment(R.id.containerList, UsersListFragment())
    }
}