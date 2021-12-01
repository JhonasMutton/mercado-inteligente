package br.edu.usf.mercadointeligentespring.core.usecase.interaction;

import br.edu.usf.mercadointeligentespring.core.mapper.InteractionMapper;
import br.edu.usf.mercadointeligentespring.gateways.InteractionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DeleteInteraction {

    private final InteractionGateway InteractionGateway;

    private final InteractionMapper InteractionMapper;

    public void execute(Long id) {
        InteractionGateway.delete(id);
    }
}
