package br.edu.usf.mercadointeligentespring.core.mapper;

import br.edu.usf.mercadointeligentespring.core.domain.Interaction;
import br.edu.usf.mercadointeligentespring.gateways.dto.InteractionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface InteractionMapper {
    InteractionDTO toDTO(Interaction interaction);

    Interaction toDomain(InteractionDTO interactionDTO);
}
