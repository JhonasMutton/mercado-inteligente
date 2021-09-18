package br.edu.usf.mercadointeligentespring.core.usecase.product;

import br.edu.usf.mercadointeligentespring.core.domain.Product;
import br.edu.usf.mercadointeligentespring.core.mapper.ProductMapper;
import br.edu.usf.mercadointeligentespring.gateways.ProductGateway;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindProducts {

    private final ProductGateway userGateway;

    private final ProductMapper userMapper;

    public List<Product> execute() {
        return userGateway.findAll()
            .stream()
            .map(userMapper::toDomain)
            .collect(Collectors.toList());
    }
}
