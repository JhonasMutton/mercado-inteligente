package br.edu.usf.gateways.database

import br.edu.usf.gateways.UserGateway
import br.edu.usf.gateways.dto.UserDTO
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository

class UserGatewayRepository: PanacheRepository<UserDTO>, UserGateway {
    override fun create(user: UserDTO): UserDTO {
        TODO("Not yet implemented")
    }

    override fun update(id: Long, user: UserDTO): UserDTO {
        TODO("Not yet implemented")
    }

    override fun delete(id: Long) {
        TODO("Not yet implemented")
    }

    override fun findById(id: Long): UserDTO {
        TODO("Not yet implemented")
    }

    override fun findAll(): List<UserDTO> {
       return list("")
    }
}