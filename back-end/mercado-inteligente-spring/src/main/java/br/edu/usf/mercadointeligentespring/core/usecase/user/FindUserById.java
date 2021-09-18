package br.edu.usf.mercadointeligentespring.core.usecase.user;

import br.edu.usf.mercadointeligentespring.core.domain.User;
import br.edu.usf.mercadointeligentespring.core.mapper.UserMapper;
import br.edu.usf.mercadointeligentespring.gateways.UserGateway;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindUserById {

    private final UserGateway userGateway;

    private final UserMapper userMapper;

    public User execute(Long id) {
        return userMapper.toDomain(userGateway.findById(id).orElseThrow(() -> new EntityNotFoundException("User not found")));
    }
}
