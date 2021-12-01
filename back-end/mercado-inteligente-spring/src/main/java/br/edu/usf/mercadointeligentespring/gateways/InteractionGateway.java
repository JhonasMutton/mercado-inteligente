package br.edu.usf.mercadointeligentespring.gateways;

import br.edu.usf.mercadointeligentespring.gateways.dto.InteractionDTO;
import java.util.List;
import java.util.Optional;

public interface InteractionGateway {
    InteractionDTO create(InteractionDTO interactionDTO);

    InteractionDTO update(Long id, InteractionDTO interactionDTO);

    void delete(Long id);

    Optional<InteractionDTO> findById(Long id);

    List<InteractionDTO> findAll();
}
