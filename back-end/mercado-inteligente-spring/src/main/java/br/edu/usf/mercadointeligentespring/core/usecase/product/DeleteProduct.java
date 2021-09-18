package br.edu.usf.mercadointeligentespring.core.usecase.product;

import br.edu.usf.mercadointeligentespring.core.mapper.ProductMapper;
import br.edu.usf.mercadointeligentespring.gateways.ProductGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DeleteProduct {

    private final ProductGateway ProductGateway;

    private final ProductMapper ProductMapper;

    public void execute(Long id) {
        ProductGateway.delete(id);
    }
}
