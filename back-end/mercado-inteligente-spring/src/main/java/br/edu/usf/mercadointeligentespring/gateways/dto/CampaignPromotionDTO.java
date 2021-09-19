package br.edu.usf.mercadointeligentespring.gateways.dto;

import java.util.List;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class CampaignPromotionDTO {
    private Long id;
    private List<PromotionDTO> promotions;
    private PromotionInfoDTO generalPromotionInfo;
}
