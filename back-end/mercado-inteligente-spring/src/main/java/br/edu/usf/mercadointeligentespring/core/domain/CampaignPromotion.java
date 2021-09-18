package br.edu.usf.mercadointeligentespring.core.domain;

import java.util.List;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class CampaignPromotion {
    private Long id;
    private List<Promotion> promotions;
    private PromotionInfo generalPromotionInfo;
}
