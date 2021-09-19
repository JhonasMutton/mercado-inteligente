package br.edu.usf.mercadointeligentespring.gateways.database;

import br.edu.usf.mercadointeligentespring.gateways.CampaignPromotionGateway;
import br.edu.usf.mercadointeligentespring.gateways.database.repository.CampaignPromotionRepository;
import br.edu.usf.mercadointeligentespring.gateways.dto.CampaignPromotionDTO;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CampaignPromotionGatewayDatabase implements CampaignPromotionGateway {

    private final CampaignPromotionRepository campaignPromotionRepository;

    @Override
    public CampaignPromotionDTO create(CampaignPromotionDTO Product) {
        return campaignPromotionRepository.save(Product);
    }

    @Override
    public CampaignPromotionDTO update(Long id, CampaignPromotionDTO CampaignPromotionDTO) {
        CampaignPromotionDTO.setId(id);
        return campaignPromotionRepository.save(CampaignPromotionDTO);
    }

    @Override
    public void delete(Long id) {
        campaignPromotionRepository.deleteById(id);
    }

    @Override
    public Optional<CampaignPromotionDTO> findById(Long id) {
        return campaignPromotionRepository.findById(id);
    }

    @Override
    public List<CampaignPromotionDTO> findAll() {
        return (List<CampaignPromotionDTO>) campaignPromotionRepository.findAll();
    }
}
