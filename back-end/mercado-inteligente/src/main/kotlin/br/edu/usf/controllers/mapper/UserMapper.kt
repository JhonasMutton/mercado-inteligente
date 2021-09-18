package br.edu.usf.controllers.mapper

import br.edu.usf.core.domain.User
import br.edu.usf.gateways.dto.UserDTO
import org.mapstruct.Mapper

@Mapper
interface UserMapper {
    fun toDTO(user: User): UserDTO
    fun toDomain(user: UserDTO): User
}