package br.edu.usf.core.domain

import java.time.LocalDate


data class User(
    val birthDay: LocalDate,
    val email: String,
    val gender: String,
    val login: String,
    val name: String,
    val password: String,
    val roles: List<String>
)