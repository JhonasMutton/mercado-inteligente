package br.edu.usf.gateways.database.repository

import br.edu.usf.gateways.dto.UserDTO
import io.quarkus.hibernate.orm.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserRepository : PanacheRepository<UserDTO> {
    fun create(user: UserDTO): UserDTO {
        persist(user)
        return user;
    }

    fun update(id: Long, user: UserDTO) {
        user.id = id
        update("where id = ?1", id, user)
    }
}