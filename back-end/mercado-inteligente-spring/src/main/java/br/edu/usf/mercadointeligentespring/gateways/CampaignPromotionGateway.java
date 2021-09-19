package br.edu.usf.mercadointeligentespring.gateways;

import br.edu.usf.mercadointeligentespring.gateways.dto.CampaignPromotionDTO;
import java.util.List;
import java.util.Optional;

public interface CampaignPromotionGateway {
    CampaignPromotionDTO create(CampaignPromotionDTO CampaignPromotionDTO);

    CampaignPromotionDTO update(Long id, CampaignPromotionDTO CampaignPromotionDTO);

    void delete(Long id);

    Optional<CampaignPromotionDTO> findById(Long id);

    List<CampaignPromotionDTO> findAll();
}
