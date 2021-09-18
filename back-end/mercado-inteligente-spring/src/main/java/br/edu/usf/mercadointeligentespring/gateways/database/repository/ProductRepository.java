package br.edu.usf.mercadointeligentespring.gateways.database.repository;

import br.edu.usf.mercadointeligentespring.gateways.dto.ProductDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CrudRepository<ProductDTO, Long> {

}