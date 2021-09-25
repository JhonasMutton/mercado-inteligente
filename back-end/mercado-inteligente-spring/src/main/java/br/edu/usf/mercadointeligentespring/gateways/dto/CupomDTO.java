package br.edu.usf.mercadointeligentespring.gateways.dto;

import br.edu.usf.mercadointeligentespring.core.domain.Discount;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
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
public class CupomDTO {
    @Id
    private String code;
    private Long useLimit;
    private Long uses;
    private String startDate;
    private String endDate;
    @ElementCollection
    private List<String> categories;
    @ElementCollection
    private List<String> targetProfiles;
    @OneToMany(cascade = CascadeType.ALL)
    private List<DiscountDTO> discounts;
}
