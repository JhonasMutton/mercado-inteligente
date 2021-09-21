package br.edu.usf.mercadointeligentespring.core.usecase.promotion;

import br.edu.usf.mercadointeligentespring.core.domain.Promotion;
import br.edu.usf.mercadointeligentespring.core.mapper.PromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.PromotionGateway;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindPromotionById {

    private final PromotionGateway PromotionGateway;

    private final PromotionMapper PromotionMapper;

    public Promotion execute(Long id) {
        return PromotionMapper.toDomain(PromotionGateway.findById(id).orElseThrow(() -> new EntityNotFoundException("Promotion not found")));
    }
}
