package br.edu.usf.mercadointeligentespring.core.usecase.interaction;

import br.edu.usf.mercadointeligentespring.core.domain.Interaction;
import br.edu.usf.mercadointeligentespring.core.mapper.InteractionMapper;
import br.edu.usf.mercadointeligentespring.gateways.InteractionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UpdateInteraction {

    private final InteractionGateway userGateway;

    private final InteractionMapper userMapper;

    public Interaction execute(Long id, Interaction user) {
        var userUpdated = userGateway.update(id, userMapper.toDTO(user));
        return userMapper.toDomain(userUpdated);
    }
}
