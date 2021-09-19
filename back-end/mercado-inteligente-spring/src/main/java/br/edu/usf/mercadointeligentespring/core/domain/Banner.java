package br.edu.usf.mercadointeligentespring.core.domain;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Banner{
    private Long id;
    private String name;
    private String image;
}
