package br.edu.usf.controllers

import br.edu.usf.core.domain.User
import br.edu.usf.core.usecase.CreateUser
import javax.enterprise.inject.Default
import javax.inject.Inject
import javax.ws.rs.POST
import javax.ws.rs.Path

@Path("/users")
class UserController {
    @Inject
    @field: Default
    lateinit var createUser: CreateUser

    @POST
    fun create(user: User) = createUser.execute(user)
}