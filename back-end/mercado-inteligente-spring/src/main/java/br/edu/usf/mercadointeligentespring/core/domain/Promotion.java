package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Promotion  {
    public Long id;
    public String targetId;
    public PromotionTargetTypeEnum targetType;
    public PromotionInfo promotionInfo;
}
