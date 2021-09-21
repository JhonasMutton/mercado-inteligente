package br.edu.usf.mercadointeligentespring.core.usecase.promotion;

import br.edu.usf.mercadointeligentespring.core.domain.Promotion;
import br.edu.usf.mercadointeligentespring.core.mapper.PromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.PromotionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CreatePromotion {

    private final PromotionGateway PromotionGateway;

    private final PromotionMapper PromotionMapper;

    public Promotion execute(Promotion Promotion) {
        var PromotionSaved = PromotionGateway.create(PromotionMapper.toDTO(Promotion));
        return PromotionMapper.toDomain(PromotionSaved);
    }
}
