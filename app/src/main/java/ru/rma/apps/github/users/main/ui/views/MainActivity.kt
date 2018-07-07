package ru.rma.apps.github.users.main.ui.views

import android.os.Bundle
import ru.rma.apps.github.users.R
import ru.rma.apps.github.users.core.ui.views.BaseActivity
import ru.rma.apps.github.users.main.ui.routers.MainRouter
import javax.inject.Inject

class MainActivity : BaseActivity(), MainView {

    @Inject
    lateinit var mRouter: MainRouter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            mRouter.addUsersList()
        }
    }
}
