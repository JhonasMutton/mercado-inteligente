package br.edu.usf.mercadointeligentespring.gateways.dto;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class PromotionInfoDTO {
    private Long id;
    private String targetId;
    private PromotionTargetTypeEnum targetType;
    private List<BannerDTO> banners;
    private List<DiscountDTO> discount;
    private List<String> targetsProfiles;
    private String salesLimit;
    private String startDate;
    private String endDate;
}
