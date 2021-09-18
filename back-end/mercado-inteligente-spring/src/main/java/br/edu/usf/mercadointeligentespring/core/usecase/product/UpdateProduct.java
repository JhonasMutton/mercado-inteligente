package br.edu.usf.mercadointeligentespring.core.usecase.product;

import br.edu.usf.mercadointeligentespring.core.domain.Product;
import br.edu.usf.mercadointeligentespring.core.mapper.ProductMapper;
import br.edu.usf.mercadointeligentespring.gateways.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UpdateProduct {

    private final ProductGateway userGateway;

    private final ProductMapper userMapper;

    public Product execute(Long id, Product user) {
        var userUpdated = userGateway.update(id, userMapper.toDTO(user));
        return userMapper.toDomain(userUpdated);
    }
}
