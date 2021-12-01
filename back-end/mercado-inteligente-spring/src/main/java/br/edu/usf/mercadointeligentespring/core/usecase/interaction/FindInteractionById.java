package br.edu.usf.mercadointeligentespring.core.usecase.interaction;

import br.edu.usf.mercadointeligentespring.core.domain.Interaction;
import br.edu.usf.mercadointeligentespring.core.mapper.InteractionMapper;
import br.edu.usf.mercadointeligentespring.gateways.InteractionGateway;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindInteractionById {

    private final InteractionGateway InteractionGateway;

    private final InteractionMapper InteractionMapper;

    public Interaction execute(Long id) {
        return InteractionMapper.toDomain(InteractionGateway.findById(id).orElseThrow(() -> new EntityNotFoundException("Interaction not found")));
    }
}
