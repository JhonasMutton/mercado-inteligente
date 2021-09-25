package br.edu.usf.mercadointeligentespring.core.mapper;

import br.edu.usf.mercadointeligentespring.core.domain.Cupom;
import br.edu.usf.mercadointeligentespring.gateways.dto.CupomDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CupomMapper {
    CupomDTO toDTO(Cupom product);

    Cupom toDomain(CupomDTO productDTO);
}
