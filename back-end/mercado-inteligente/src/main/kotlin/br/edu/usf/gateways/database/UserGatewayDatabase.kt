package br.edu.usf.gateways.database

import br.edu.usf.gateways.UserGateway
import br.edu.usf.gateways.database.repository.UserRepository
import br.edu.usf.gateways.dto.UserDTO
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class UserGatewayDatabase(val userRepository: UserRepository) : UserGateway {
    override fun create(user: UserDTO): UserDTO = userRepository.create(user)


    override fun update(id: Long, user: UserDTO) = userRepository.update(id, user)

    override fun delete(id: Long) = userRepository.deleteById(id)

    override fun findById(id: Long): UserDTO? {
        return userRepository.findById(id)
    }

    override fun findAll(): List<UserDTO> {
      return userRepository.findAll().list()
    }
}