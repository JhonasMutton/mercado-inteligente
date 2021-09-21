package br.edu.usf.mercadointeligentespring.gateways.dto;

import br.edu.usf.mercadointeligentespring.core.domain.enums.DiscountTypeEnum;
import br.edu.usf.mercadointeligentespring.core.domain.enums.PaymentMethodEnum;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class DiscountDTO {
    @Id
    @GeneratedValue
    private Long id;
    @Enumerated
    private DiscountTypeEnum type;
    @Enumerated
    private PaymentMethodEnum paymentMethod;
    private Float value;
}

