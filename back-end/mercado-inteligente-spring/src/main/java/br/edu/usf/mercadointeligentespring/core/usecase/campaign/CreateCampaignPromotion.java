package br.edu.usf.mercadointeligentespring.core.usecase.campaign;

import br.edu.usf.mercadointeligentespring.core.domain.CampaignPromotion;
import br.edu.usf.mercadointeligentespring.core.mapper.CampaignPromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.CampaignPromotionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CreateCampaignPromotion {

    private final CampaignPromotionGateway CampaignPromotionGateway;

    private final CampaignPromotionMapper CampaignPromotionMapper;

    public CampaignPromotion execute(CampaignPromotion CampaignPromotion) {
        var CampaignPromotionSaved = CampaignPromotionGateway.create(CampaignPromotionMapper.toDTO(CampaignPromotion));
        return CampaignPromotionMapper.toDomain(CampaignPromotionSaved);
    }
}
