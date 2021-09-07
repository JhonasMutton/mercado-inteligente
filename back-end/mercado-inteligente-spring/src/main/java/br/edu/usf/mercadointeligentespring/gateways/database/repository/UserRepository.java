package br.edu.usf.mercadointeligentespring.gateways.database.repository;

import br.edu.usf.mercadointeligentespring.gateways.dto.UserDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<UserDTO, Long> {

}