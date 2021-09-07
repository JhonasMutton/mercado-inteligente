package br.edu.usf.mercadointeligentespring.core.usecase;

import br.edu.usf.mercadointeligentespring.core.domain.User;
import br.edu.usf.mercadointeligentespring.core.mapper.UserMapper;
import br.edu.usf.mercadointeligentespring.gateways.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CreateUser {

    private final UserGateway userGateway;

    private final UserMapper userMapper;

    public User execute(User user) {
        var userSaved = userGateway.create(userMapper.toDTO(user));
        return userMapper.toDomain(userSaved);
    }
}