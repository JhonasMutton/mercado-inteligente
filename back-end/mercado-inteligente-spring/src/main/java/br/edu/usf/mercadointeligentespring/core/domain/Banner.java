package br.edu.usf.mercadointeligentespring.core.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Banner{
    private Long id;
    private String name;
    private String image;
}

