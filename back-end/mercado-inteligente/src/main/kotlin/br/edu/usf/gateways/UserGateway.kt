package br.edu.usf.gateways

import br.edu.usf.gateways.dto.UserDTO

interface UserGateway {
    fun create(user: UserDTO): UserDTO
    fun update(id: Long, user: UserDTO)
    fun delete(id: Long): Boolean
    fun findById(id: Long): UserDTO?
    fun findAll(): List<UserDTO>
}