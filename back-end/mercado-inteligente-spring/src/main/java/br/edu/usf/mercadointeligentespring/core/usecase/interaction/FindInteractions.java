package br.edu.usf.mercadointeligentespring.core.usecase.interaction;

import br.edu.usf.mercadointeligentespring.core.domain.Interaction;
import br.edu.usf.mercadointeligentespring.core.mapper.InteractionMapper;
import br.edu.usf.mercadointeligentespring.gateways.InteractionGateway;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindInteractions {

    private final InteractionGateway userGateway;

    private final InteractionMapper userMapper;

    public List<Interaction> execute() {
        return userGateway.findAll()
            .stream()
            .map(userMapper::toDomain)
            .collect(Collectors.toList());
    }
}
