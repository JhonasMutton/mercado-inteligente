package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PromotionInfo {
    private Long id;
    private String targetId;
    private PromotionTargetTypeEnum targetType;
    private List<Banner> banners;
    private List<Discount> discount;
    private List<String> targetsProfiles;
    private Long salesLimit;
    private Long sales;
    private String startDate;
    private String endDate;
}
