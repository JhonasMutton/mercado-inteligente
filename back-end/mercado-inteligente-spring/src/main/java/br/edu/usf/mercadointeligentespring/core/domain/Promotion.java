package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Promotion  {
    private Long id;
    private String targetId;
    private PromotionTargetTypeEnum targetType;
    private PromotionInfo promotionInfo;
}
