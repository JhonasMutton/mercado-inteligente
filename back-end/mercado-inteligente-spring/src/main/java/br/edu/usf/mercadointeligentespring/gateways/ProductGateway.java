package br.edu.usf.mercadointeligentespring.gateways;

import br.edu.usf.mercadointeligentespring.gateways.dto.ProductDTO;
import java.util.List;
import java.util.Optional;

public interface ProductGateway {
    ProductDTO create(ProductDTO ProductDTO);

    ProductDTO update(Long id, ProductDTO ProductDTO);

    void delete(Long id);

    Optional<ProductDTO> findById(Long id);

    List<ProductDTO> findAll();
}
