package br.edu.usf.mercadointeligentespring.core.domain;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {
    private Long id;
    private String name;
    private List<String> categories;
    private Double price;
    private Byte[] image;
    private Long stock;
    private Long sales;
}
