package ru.rma.apps.github.users.core.business.mappers

import ru.rma.apps.github.users.core.data.entities.UserEntity
import ru.rma.apps.github.users.core.ui.models.UserModel
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserMapper @Inject constructor() {

    fun entityToModel(entity: UserEntity) = UserModel(entity.mId, entity.mLogin)

    fun entitiesToModels(entities: List<UserEntity>) = entities.map { entityToModel(it) }
}