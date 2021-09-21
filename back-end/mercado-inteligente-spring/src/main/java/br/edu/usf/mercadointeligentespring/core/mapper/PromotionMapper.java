package br.edu.usf.mercadointeligentespring.core.mapper;

import br.edu.usf.mercadointeligentespring.core.domain.Promotion;
import br.edu.usf.mercadointeligentespring.gateways.dto.PromotionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface PromotionMapper {
    PromotionDTO toDTO(Promotion product);

    Promotion toDomain(PromotionDTO productDTO);
}
