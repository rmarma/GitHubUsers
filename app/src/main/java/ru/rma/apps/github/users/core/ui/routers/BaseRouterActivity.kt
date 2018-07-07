package ru.rma.apps.github.users.core.ui.routers

import ru.rma.apps.github.users.core.ui.views.BaseActivity
import ru.rma.apps.github.users.core.ui.views.BaseFragment

abstract class BaseRouterActivity<T: BaseActivity>(
        protected val mActivity: T
) {

    protected val mFragmentManager = mActivity.supportFragmentManager


    fun addFragment(containerViewId: Int, fragment: BaseFragment) {
        addFragment(containerViewId, fragment, null)
    }

    fun addFragment(containerViewId: Int, fragment: BaseFragment, tag: String?) {
        mFragmentManager.beginTransaction()
                .add(containerViewId, fragment, tag)
                .commit()
    }
}