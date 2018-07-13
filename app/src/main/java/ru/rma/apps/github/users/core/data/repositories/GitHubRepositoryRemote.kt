package ru.rma.apps.github.users.core.data.repositories

import ru.rma.apps.github.users.core.data.net.GitHubApi
import javax.inject.Inject

class GitHubRepositoryRemote @Inject constructor(
        private val mGitHubApi: GitHubApi
) : GitHubRepository {


}