package br.edu.usf.mercadointeligentespring.core.usecase.interaction;

import br.edu.usf.mercadointeligentespring.core.domain.Interaction;
import br.edu.usf.mercadointeligentespring.core.mapper.InteractionMapper;
import br.edu.usf.mercadointeligentespring.gateways.InteractionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CreateInteraction {

    private final InteractionGateway InteractionGateway;

    private final InteractionMapper InteractionMapper;

    public Interaction execute(Interaction Interaction) {
        var InteractionSaved = InteractionGateway.create(InteractionMapper.toDTO(Interaction));
        return InteractionMapper.toDomain(InteractionSaved);
    }
}
