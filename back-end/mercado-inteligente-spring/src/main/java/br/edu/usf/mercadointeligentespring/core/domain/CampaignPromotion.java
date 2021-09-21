package br.edu.usf.mercadointeligentespring.core.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CampaignPromotion {
    private Long id;
    private List<Promotion> promotions;
    private PromotionInfo generalPromotionInfo;
}
