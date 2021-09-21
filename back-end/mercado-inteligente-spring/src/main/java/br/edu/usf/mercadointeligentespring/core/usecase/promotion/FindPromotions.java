package br.edu.usf.mercadointeligentespring.core.usecase.promotion;

import br.edu.usf.mercadointeligentespring.core.domain.Promotion;
import br.edu.usf.mercadointeligentespring.core.mapper.PromotionMapper;
import br.edu.usf.mercadointeligentespring.gateways.PromotionGateway;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindPromotions {

    private final PromotionGateway userGateway;

    private final PromotionMapper userMapper;

    public List<Promotion> execute() {
        return userGateway.findAll()
            .stream()
            .map(userMapper::toDomain)
            .collect(Collectors.toList());
    }
}
