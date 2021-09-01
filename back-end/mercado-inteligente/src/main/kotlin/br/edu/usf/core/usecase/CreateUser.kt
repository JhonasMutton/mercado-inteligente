package br.edu.usf.core.usecase

import br.edu.usf.core.domain.User

interface CreateUser {
    fun execute(user: User): User
}