package br.edu.usf.mercadointeligentespring.core.usecase.campaign;

import br.edu.usf.mercadointeligentespring.core.domain.CampaignPromotion;
import br.edu.usf.mercadointeligentespring.core.mapper.CampaignPromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.CampaignPromotionGateway;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindCampaignPromotions {

    private final CampaignPromotionGateway userGateway;

    private final CampaignPromotionMapper userMapper;

    public List<CampaignPromotion> execute() {
        return userGateway.findAll()
            .stream()
            .map(userMapper::toDomain)
            .collect(Collectors.toList());
    }
}
