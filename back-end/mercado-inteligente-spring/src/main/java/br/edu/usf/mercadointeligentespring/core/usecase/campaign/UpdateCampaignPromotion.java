package br.edu.usf.mercadointeligentespring.core.usecase.campaign;

import br.edu.usf.mercadointeligentespring.core.domain.CampaignPromotion;
import br.edu.usf.mercadointeligentespring.core.mapper.CampaignPromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.CampaignPromotionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UpdateCampaignPromotion {

    private final CampaignPromotionGateway userGateway;

    private final CampaignPromotionMapper userMapper;

    public CampaignPromotion execute(Long id, CampaignPromotion user) {
        var userUpdated = userGateway.update(id, userMapper.toDTO(user));
        return userMapper.toDomain(userUpdated);
    }
}
