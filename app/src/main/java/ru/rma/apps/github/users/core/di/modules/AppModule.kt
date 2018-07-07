package ru.rma.apps.github.users.core.di.modules

import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import ru.rma.apps.github.users.App
import ru.rma.apps.github.users.core.data.net.GitHubApi
import ru.rma.apps.github.users.core.data.net.URL_GITHUB
import javax.inject.Singleton

@Module(includes = [AndroidSupportInjectionModule::class,
    ActivitiesModule::class,
    FragmentsModule::class])
class AppModule {

    @Provides
    @Singleton
    fun context(app: App) = app.applicationContext

    @Provides
    @Singleton
    fun httpClient() = OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun api(client: OkHttpClient) = Retrofit.Builder()
            .baseUrl(URL_GITHUB)
            .build()
            .create(GitHubApi::class.java)
}