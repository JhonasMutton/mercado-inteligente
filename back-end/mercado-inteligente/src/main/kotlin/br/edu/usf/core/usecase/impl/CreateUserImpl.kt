package br.edu.usf.core.usecase.impl

import br.edu.usf.core.domain.User
import br.edu.usf.core.usecase.CreateUser
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
class CreateUserImpl : CreateUser {
    override fun execute(user: User): User {
        TODO("Not yet implemented")
    }
}