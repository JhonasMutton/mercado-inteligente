package br.edu.usf.mercadointeligentespring.core.usecase.user;

import br.edu.usf.mercadointeligentespring.core.domain.User;
import br.edu.usf.mercadointeligentespring.core.mapper.UserMapper;
import br.edu.usf.mercadointeligentespring.gateways.UserGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DeleteUser {

    private final UserGateway userGateway;

    private final UserMapper userMapper;

    public void execute(Long id) {
        userGateway.delete(id);
    }
}
