package br.edu.usf.controllers

import br.edu.usf.core.domain.User
import br.edu.usf.core.usecase.CreateUser
import org.jboss.logging.annotations.Pos
import org.jboss.resteasy.annotations.Body
import javax.ws.rs.GET
import javax.ws.rs.POST
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/users")
class UserController(
    val createUser: CreateUser
) {
    @POST
    fun create(user: User) = createUser.execute(user)
}