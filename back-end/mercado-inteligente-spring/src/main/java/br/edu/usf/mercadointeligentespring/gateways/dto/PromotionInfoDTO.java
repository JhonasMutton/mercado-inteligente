package br.edu.usf.mercadointeligentespring.gateways.dto;

import br.edu.usf.mercadointeligentespring.core.domain.enums.PromotionTargetTypeEnum;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class PromotionInfoDTO {
    @Id
    @GeneratedValue
    private Long id;
    private String targetId;
    @Enumerated
    private PromotionTargetTypeEnum targetType;
    @OneToMany(cascade = CascadeType.ALL)
    private List<BannerDTO> banners;
    @OneToMany(cascade = CascadeType.ALL)
    private List<DiscountDTO> discount;
    @ElementCollection
    private List<String> targetsProfiles;
    private Long salesLimit;
    private Long sales;
    private String startDate;
    private String endDate;
}
