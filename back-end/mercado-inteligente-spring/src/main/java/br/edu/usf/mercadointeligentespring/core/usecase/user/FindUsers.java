package br.edu.usf.mercadointeligentespring.core.usecase.user;

import br.edu.usf.mercadointeligentespring.core.domain.User;
import br.edu.usf.mercadointeligentespring.core.mapper.UserMapper;
import br.edu.usf.mercadointeligentespring.gateways.UserGateway;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindUsers {

    private final UserGateway userGateway;

    private final UserMapper userMapper;

    public List<User> execute() {
        return userGateway.findAll()
            .stream()
            .map(userMapper::toDomain)
            .collect(Collectors.toList());
    }
}
