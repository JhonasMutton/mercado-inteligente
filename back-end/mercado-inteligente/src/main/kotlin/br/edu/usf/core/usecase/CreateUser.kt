package br.edu.usf.core.usecase

import br.edu.usf.controllers.mapper.UserMapper
import br.edu.usf.core.domain.User
import br.edu.usf.gateways.UserGateway
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CreateUser(val userGateway: UserGateway, val userMapper: UserMapper) {
    fun execute(user: User): User {
        val userSaved = userGateway.create(userMapper.toDTO(user))
        return userMapper.toDomain(userSaved);
    }
}