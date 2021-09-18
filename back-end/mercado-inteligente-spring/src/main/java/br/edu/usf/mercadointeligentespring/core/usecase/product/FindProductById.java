package br.edu.usf.mercadointeligentespring.core.usecase.product;

import br.edu.usf.mercadointeligentespring.core.domain.Product;
import br.edu.usf.mercadointeligentespring.core.mapper.ProductMapper;
import br.edu.usf.mercadointeligentespring.gateways.ProductGateway;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindProductById {

    private final ProductGateway ProductGateway;

    private final ProductMapper ProductMapper;

    public Product execute(Long id) {
        return ProductMapper.toDomain(ProductGateway.findById(id).orElseThrow(() -> new EntityNotFoundException("Product not found")));
    }
}
