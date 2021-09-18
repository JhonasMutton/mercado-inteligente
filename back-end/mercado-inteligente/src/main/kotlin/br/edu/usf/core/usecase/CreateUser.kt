package br.edu.usf.core.usecase

import br.edu.usf.controllers.mapper.UserMapper
import br.edu.usf.core.domain.User
import br.edu.usf.gateways.UserGateway
import org.mapstruct.factory.Mappers
import javax.enterprise.context.ApplicationScoped
import javax.enterprise.inject.Default
import javax.inject.Inject

@ApplicationScoped
class CreateUser {
    @Inject
    @field: Default
    lateinit var userGateway: UserGateway

    var userMapper: UserMapper = Mappers.getMapper(UserMapper::class.java)

    fun execute(user: User): User {
        val userSaved = userGateway.create(userMapper.toDTO(user))
        return userMapper.toDomain(userSaved);
    }
}