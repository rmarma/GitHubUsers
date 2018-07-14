package ru.rma.apps.github.users.users.list.ui.views

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.rma.apps.github.users.R
import ru.rma.apps.github.users.core.ui.models.UserModel
import ru.rma.apps.github.users.core.ui.views.BaseFragment
import ru.rma.apps.github.users.users.list.ui.adapters.UsersAdapter
import ru.rma.apps.github.users.users.list.ui.presenters.UsersListPresenter
import javax.inject.Inject

class UsersListFragment : BaseFragment(), UsersListView {

    @Inject
    lateinit var mPresenter: UsersListPresenter
    @Inject
    lateinit var mAdapter: UsersAdapter


    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.frg_users_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        mPresenter.created()
    }

    override fun onResume() {
        super.onResume()

        mPresenter.attachView(this)
    }

    override fun onPause() {
        super.onPause()

        mPresenter.detachView()
    }

    override fun onDestroy() {
        super.onDestroy()

        mPresenter.destroy()
    }


    override fun showUsers(list: List<UserModel>) {
        mAdapter.setUsers(list)
    }
}