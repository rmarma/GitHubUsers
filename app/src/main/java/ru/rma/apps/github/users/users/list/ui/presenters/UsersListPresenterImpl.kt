package ru.rma.apps.github.users.users.list.ui.presenters

import io.reactivex.disposables.CompositeDisposable
import ru.rma.apps.github.users.users.list.business.interactors.UsersListInteractor
import ru.rma.apps.github.users.users.list.ui.views.UsersListView
import ru.rma.apps.github.users.users.list.ui.views.UsersListViewEmpty
import javax.inject.Inject

class UsersListPresenterImpl @Inject constructor(
        private val mInteractor: UsersListInteractor
) : UsersListPresenter {

    private val mViewEmpty = UsersListViewEmpty()

    private var mView: UsersListView = mViewEmpty

    private val mCompositeDisposable = CompositeDisposable()


    override fun created() {

    }

    override fun attachView(view: UsersListView) {
        mView = view

        mCompositeDisposable.add(mInteractor.users()
                .subscribe({
                    mView.showUsers(it)
                }, {
                    // TODO("Handle error")
                }))
    }

    override fun detachView() {
        mView = mViewEmpty
    }

    override fun destroy() {
        mCompositeDisposable.clear()
    }
}