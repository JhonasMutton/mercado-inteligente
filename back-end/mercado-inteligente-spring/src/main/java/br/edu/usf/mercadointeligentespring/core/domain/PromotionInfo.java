package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public abstract class PromotionInfo {
    public String id;
    public String targetId;
    public PromotionTargetTypeEnum targetType;
    public List<Banner> banners;
    public List<Discount> discount;
    public List<String> targetsProfiles;
    public String salesLimit;
    public String startDate;
    public String endDate;
}
