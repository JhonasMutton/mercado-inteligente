package br.edu.usf.mercadointeligentespring.core.mapper;

import br.edu.usf.mercadointeligentespring.core.domain.CampaignPromotion;
import br.edu.usf.mercadointeligentespring.gateways.dto.CampaignPromotionDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.springframework.stereotype.Component;

@Component
@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.WARN)
public interface CampaignPromotionMapper {
    CampaignPromotionDTO toDTO(CampaignPromotion product);

    CampaignPromotion toDomain(CampaignPromotionDTO productDTO);
}
