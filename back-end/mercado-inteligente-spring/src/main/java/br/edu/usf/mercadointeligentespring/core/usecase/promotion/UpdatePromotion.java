package br.edu.usf.mercadointeligentespring.core.usecase.promotion;

import br.edu.usf.mercadointeligentespring.core.domain.Promotion;
import br.edu.usf.mercadointeligentespring.core.mapper.PromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.PromotionGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UpdatePromotion {

    private final PromotionGateway userGateway;

    private final PromotionMapper userMapper;

    public Promotion execute(Long id, Promotion user) {
        var userUpdated = userGateway.update(id, userMapper.toDTO(user));
        return userMapper.toDomain(userUpdated);
    }
}
