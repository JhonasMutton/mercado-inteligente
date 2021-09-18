package br.edu.usf.mercadointeligentespring.core.usecase.product;

import br.edu.usf.mercadointeligentespring.core.domain.Product;
import br.edu.usf.mercadointeligentespring.core.mapper.ProductMapper;
import br.edu.usf.mercadointeligentespring.gateways.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CreateProduct {

    private final ProductGateway ProductGateway;

    private final ProductMapper ProductMapper;

    public Product execute(Product Product) {
        var ProductSaved = ProductGateway.create(ProductMapper.toDTO(Product));
        return ProductMapper.toDomain(ProductSaved);
    }
}
