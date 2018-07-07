package ru.rma.apps.github.users.core.data.net

import io.reactivex.Single
import retrofit2.http.GET
import ru.rma.apps.github.users.core.data.entities.UserEntity

const val URL_GITHUB = "https://api.github.com/"

interface GitHubApi {

    @GET("users/")
    fun users(): Single<List<UserEntity>>
}