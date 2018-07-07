package ru.rma.apps.github.users.core.ui.presenters

import ru.rma.apps.github.users.core.ui.views.BaseView

interface BasePresenter<T : BaseView> {

    fun created()
    fun attachView(view: T)
    fun detachView()
    fun destroy()
}