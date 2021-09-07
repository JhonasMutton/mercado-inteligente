package br.edu.usf.mercadointeligentespring.gateways;

import br.edu.usf.mercadointeligentespring.gateways.dto.UserDTO;
import java.util.List;
import java.util.Optional;

public interface UserGateway {
    UserDTO create(UserDTO userDTO);

    UserDTO update(Long id, UserDTO userDTO);

    void delete(Long id);

    Optional<UserDTO> findById(Long id);

    List<UserDTO> findAll();
}