package br.edu.usf.mercadointeligentespring.core.mapper;

import br.edu.usf.mercadointeligentespring.core.domain.Product;
import br.edu.usf.mercadointeligentespring.gateways.dto.ProductDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface ProductMapper {
    ProductDTO toDTO(Product product);

    Product toDomain(ProductDTO productDTO);
}
