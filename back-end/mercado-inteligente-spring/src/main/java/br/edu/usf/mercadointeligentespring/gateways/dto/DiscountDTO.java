package br.edu.usf.mercadointeligentespring.gateways.dto;

import br.edu.usf.mercadointeligentespring.core.domain.enums.DiscountTypeEnum;
import br.edu.usf.mercadointeligentespring.core.domain.enums.PaymentMethodEnum;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class DiscountDTO {
    private DiscountTypeEnum type;
    private PaymentMethodEnum paymentMethod;
    private Float value;
}

