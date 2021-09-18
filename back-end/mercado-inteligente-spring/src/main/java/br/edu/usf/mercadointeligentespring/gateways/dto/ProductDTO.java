package br.edu.usf.mercadointeligentespring.gateways.dto;

import java.time.LocalDate;
import java.util.List;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "Product")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    @ElementCollection
    private List<String> categories;
    private Double price;
    @Lob
    private Byte[] image;
    private Long stock;
    private Long sales;
}
