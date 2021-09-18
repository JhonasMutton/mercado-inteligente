package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Promotion  {
    public String id;
    public String targetId;
    public PromotionTargetTypeEnum targetType;
    public PromotionInfo promotionInfo;
}
