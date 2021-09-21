package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.DiscountTypeEnum;
import br.edu.usf.mercadointeligentespring.core.domain.enums.PaymentMethodEnum;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Discount {
    private Long id;
    private DiscountTypeEnum type;
    private PaymentMethodEnum paymentMethod;
    private Float value;
}

