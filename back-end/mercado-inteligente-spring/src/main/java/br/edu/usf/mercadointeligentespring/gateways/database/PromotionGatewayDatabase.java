package br.edu.usf.mercadointeligentespring.gateways.database;

import br.edu.usf.mercadointeligentespring.gateways.PromotionGateway;
import br.edu.usf.mercadointeligentespring.gateways.database.repository.PromotionRepository;
import br.edu.usf.mercadointeligentespring.gateways.dto.PromotionDTO;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class PromotionGatewayDatabase implements PromotionGateway {

    private final PromotionRepository promotionRepository;

    @Override
    public PromotionDTO create(PromotionDTO Product) {
        return promotionRepository.save(Product);
    }

    @Override
    public PromotionDTO update(Long id, PromotionDTO PromotionDTO) {
        PromotionDTO.setId(id);
        return promotionRepository.save(PromotionDTO);
    }

    @Override
    public void delete(Long id) {
        promotionRepository.deleteById(id);
    }

    @Override
    public Optional<PromotionDTO> findById(Long id) {
        return promotionRepository.findById(id);
    }

    @Override
    public List<PromotionDTO> findAll() {
        return (List<PromotionDTO>) promotionRepository.findAll();
    }
}
