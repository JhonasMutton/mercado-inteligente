package br.edu.usf.mercadointeligentespring.core.domain;

import br.edu.usf.mercadointeligentespring.core.domain.enums.InteractionEnum;
import java.time.LocalDateTime;
import javax.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Interaction {
    private Long id;
    private User user;
    private InteractionEnum interaction;
    private Product product;
    private Boolean isPromotional;
    private LocalDateTime time;
}
