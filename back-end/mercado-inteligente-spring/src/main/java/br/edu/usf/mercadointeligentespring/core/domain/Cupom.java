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
public class Cupom {
    private String code;
    private Long useLimit;
    private Long uses;
    private String startDate;
    private String endDate;
    private List<String> categories;
    private List<String> targetProfiles;
    private List<Discount> discounts;
}
