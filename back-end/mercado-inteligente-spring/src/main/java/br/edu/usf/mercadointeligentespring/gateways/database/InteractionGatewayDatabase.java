package br.edu.usf.mercadointeligentespring.gateways.database;

import br.edu.usf.mercadointeligentespring.gateways.InteractionGateway;
import br.edu.usf.mercadointeligentespring.gateways.database.repository.InteractionRepository;
import br.edu.usf.mercadointeligentespring.gateways.dto.InteractionDTO;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class InteractionGatewayDatabase implements InteractionGateway {

    private final InteractionRepository interactionRepository;

    @Override
    public InteractionDTO create(InteractionDTO Interaction) {
        return interactionRepository.save(Interaction);
    }

    @Override
    public InteractionDTO update(Long id, InteractionDTO InteractionDTO) {
        InteractionDTO.setId(id);
        return interactionRepository.save(InteractionDTO);
    }

    @Override
    public void delete(Long id) {
        interactionRepository.deleteById(id);
    }

    @Override
    public Optional<InteractionDTO> findById(Long id) {
        return interactionRepository.findById(id);
    }

    @Override
    public List<InteractionDTO> findAll() {
        return (List<InteractionDTO>) interactionRepository.findAll();
    }
}
