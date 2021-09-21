package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromotionInfo {
    public Long id;
    public String targetId;
    public PromotionTargetTypeEnum targetType;
    public List<Banner> banners;
    public List<Discount> discount;
    public List<String> targetsProfiles;
    public String salesLimit;
    public String startDate;
    public String endDate;
}
