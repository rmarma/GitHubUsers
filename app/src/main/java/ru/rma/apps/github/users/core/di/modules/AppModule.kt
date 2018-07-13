package ru.rma.apps.github.users.core.di.modules

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
abstract class AppModule {

    @Provides
    @Singleton
    fun provideContext(app: App) = app.applicationContext

    @Provides
    @Singleton
    fun provideHttpClient() = OkHttpClient.Builder().build()

    @Provides
    @Singleton
    fun provideApi(client: OkHttpClient) = Retrofit.Builder()
            .baseUrl(URL_GITHUB)
            .client(client)
            .build()
            .create(GitHubApi::class.java)

    @Provides
    @Singleton
    @Remote
    fun provideGitHubRepositoryRemote(repository: GitHubRepositoryRemote): GitHubRepository = repository

    @Provides
    @Singleton
    @Local
    fun provideGitHubRepositoryLocal(repository: GitHubRepositoryLocal): GitHubRepository = repository
}