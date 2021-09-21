package br.edu.usf.mercadointeligentespring.core.usecase.campaign;

import br.edu.usf.mercadointeligentespring.core.mapper.CampaignPromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.CampaignPromotionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DeleteCampaignPromotion {

    private final CampaignPromotionGateway CampaignPromotionGateway;

    private final CampaignPromotionMapper CampaignPromotionMapper;

    public void execute(Long id) {
        CampaignPromotionGateway.delete(id);
    }
}
