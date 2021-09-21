package br.edu.usf.mercadointeligentespring.core.usecase.campaign;

import br.edu.usf.mercadointeligentespring.core.domain.CampaignPromotion;
import br.edu.usf.mercadointeligentespring.core.mapper.CampaignPromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.CampaignPromotionGateway;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindCampaignPromotionById {

    private final CampaignPromotionGateway CampaignPromotionGateway;

    private final CampaignPromotionMapper CampaignPromotionMapper;

    public CampaignPromotion execute(Long id) {
        return CampaignPromotionMapper.toDomain(CampaignPromotionGateway.findById(id).orElseThrow(() -> new EntityNotFoundException("CampaignPromotion not found")));
    }
}
