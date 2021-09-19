package br.edu.usf.mercadointeligentespring.gateways.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class BannerDTO {
    private Long id;
    private String name;
    private String image;
}

