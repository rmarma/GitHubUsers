package ru.rma.apps.github.users.users.list.ui.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.ViewGroup
import ru.rma.apps.github.users.core.di.scopes.FragmentScope
import ru.rma.apps.github.users.core.ui.models.UserModel
import javax.inject.Inject

@FragmentScope
class UsersAdapter @Inject constructor() : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): RecyclerView.ViewHolder {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getItemCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onBindViewHolder(p0: RecyclerView.ViewHolder, p1: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


    fun setUsers(list: List<UserModel>) {
        Log.v("AAA", "setUsers: " + list.size)
    }
}