package br.edu.usf.mercadointeligentespring.gateways.dto;

import java.time.LocalDateTime;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class InteractionDTO {
    @Id
    @GeneratedValue
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private UserDTO user;
    @Enumerated
    private InteractionEnum interaction;
    @ManyToOne(cascade = CascadeType.ALL)
    private ProductDTO product;
    private Boolean isPromotional;
    @CreatedDate
    private LocalDateTime time;
}