package br.edu.usf.gateways.dto

import javax.persistence.ElementCollection
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity(name = "user")
class UserDTO {
    @Id
    @GeneratedValue
    var id: Long? = null;
    lateinit var login: String
    lateinit var name: String
    lateinit var email: String
    lateinit var gender: String
    @ElementCollection
    lateinit var roles: List<String>
    lateinit var password: String
    lateinit var birthDay: String
}