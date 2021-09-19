package br.edu.usf.mercadointeligentespring.gateways;

import br.edu.usf.mercadointeligentespring.gateways.dto.PromotionDTO;
import java.util.List;
import java.util.Optional;

public interface PromotionGateway {
    PromotionDTO create(PromotionDTO PromotionDTO);

    PromotionDTO update(Long id, PromotionDTO PromotionDTO);

    void delete(Long id);

    Optional<PromotionDTO> findById(Long id);

    List<PromotionDTO> findAll();
}
