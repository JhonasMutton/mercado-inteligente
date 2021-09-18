package br.edu.usf.mercadointeligentespring.core.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@NoArgsConstructor
@Accessors(chain = true)
public class Banner{
    private Long id;
    private String name;
    private String image;
}

