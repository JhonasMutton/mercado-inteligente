package br.edu.usf.mercadointeligentespring.core.usecase.promotion;

import br.edu.usf.mercadointeligentespring.core.mapper.PromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.PromotionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DeletePromotion {

    private final PromotionGateway PromotionGateway;

    private final PromotionMapper PromotionMapper;

    public void execute(Long id) {
        PromotionGateway.delete(id);
    }
}
