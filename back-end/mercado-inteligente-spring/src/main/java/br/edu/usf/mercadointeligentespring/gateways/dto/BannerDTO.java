package br.edu.usf.mercadointeligentespring.gateways.dto;

import javax.persistence.Entity;
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
public class BannerDTO {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String image;
}

