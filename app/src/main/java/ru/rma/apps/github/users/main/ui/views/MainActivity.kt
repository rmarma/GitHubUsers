package ru.rma.apps.github.users.main.ui.views

import android.os.Bundle
import ru.rma.apps.github.users.R
import ru.rma.apps.github.users.core.ui.BaseActivity

class MainActivity : BaseActivity(), MainView {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
