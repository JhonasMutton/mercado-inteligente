package br.edu.usf.mercadointeligentespring.gateways.database;

import br.edu.usf.mercadointeligentespring.gateways.UserGateway;
import br.edu.usf.mercadointeligentespring.gateways.database.repository.UserRepository;
import br.edu.usf.mercadointeligentespring.gateways.dto.UserDTO;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class UserGatewayDatabase implements UserGateway {

    private final UserRepository userRepository;

    @Override
    public UserDTO create(UserDTO user) {
        return userRepository.save(user);
    }

    @Override
    public UserDTO update(Long id, UserDTO userDTO) {
        userDTO.setId(id);
        return userRepository.save(userDTO);
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public Optional<UserDTO> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public List<UserDTO> findAll() {
        return (List<UserDTO>) userRepository.findAll();
    }
}