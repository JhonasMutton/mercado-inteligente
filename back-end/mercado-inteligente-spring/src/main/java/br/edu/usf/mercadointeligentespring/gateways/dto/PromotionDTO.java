package br.edu.usf.mercadointeligentespring.gateways.dto;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class PromotionDTO {
    private Long id;
    private String targetId;
    private PromotionTargetTypeEnum targetType;
    private PromotionInfoDTO promotionInfo;
}
