package ru.rma.apps.github.users.core.di.modules

import android.content.Context
import dagger.Module
import dagger.Provides
import dagger.android.support.AndroidSupportInjectionModule
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import ru.rma.apps.github.users.App
import ru.rma.apps.github.users.core.data.net.GitHubApi
import ru.rma.apps.github.users.core.data.net.URL_GITHUB
import ru.rma.apps.github.users.core.data.repositories.GitHubRepository
import ru.rma.apps.github.users.core.data.repositories.GitHubRepositoryLocal
import ru.rma.apps.github.users.core.data.repositories.GitHubRepositoryRemote
import ru.rma.apps.github.users.core.di.annotations.Local
import ru.rma.apps.github.users.core.di.annotations.Remote
import javax.inject.Singleton

@Module(includes = [AndroidSupportInjectionModule::class,
    SchedulersModule::class,
    ActivitiesModule::class,
    FragmentsModule::class])
class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App): Context = app.applicationContext

    @Provides
    @Singleton
    fun provideHttpClient(): OkHttpClient = OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun provideApi(client: OkHttpClient): GitHubApi = Retrofit.Builder()
            .baseUrl(URL_GITHUB)
            .client(client)
            .build()
            .create(GitHubApi::class.java)

    @Remote
    @Provides
    @Singleton
    fun provideGitHubRepositoryRemote(repository: GitHubRepositoryRemote): GitHubRepository = repository

    @Local
    @Provides
    @Singleton
    fun provideGitHubRepositoryLocal(repository: GitHubRepositoryLocal): GitHubRepository = repository
}