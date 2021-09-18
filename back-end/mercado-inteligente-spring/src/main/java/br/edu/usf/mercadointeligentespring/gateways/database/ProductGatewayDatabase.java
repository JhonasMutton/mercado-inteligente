package br.edu.usf.mercadointeligentespring.gateways.database;

import br.edu.usf.mercadointeligentespring.gateways.ProductGateway;
import br.edu.usf.mercadointeligentespring.gateways.database.repository.ProductRepository;
import br.edu.usf.mercadointeligentespring.gateways.dto.ProductDTO;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class ProductGatewayDatabase implements ProductGateway {

    private final ProductRepository productRepository;

    @Override
    public ProductDTO create(ProductDTO Product) {
        return productRepository.save(Product);
    }

    @Override
    public ProductDTO update(Long id, ProductDTO ProductDTO) {
        ProductDTO.setId(id);
        return productRepository.save(ProductDTO);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<ProductDTO> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<ProductDTO> findAll() {
        return (List<ProductDTO>) productRepository.findAll();
    }
}
