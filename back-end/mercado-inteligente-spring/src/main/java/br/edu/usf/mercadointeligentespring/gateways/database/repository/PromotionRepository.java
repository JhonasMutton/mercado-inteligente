package br.edu.usf.mercadointeligentespring.gateways.database.repository;

import br.edu.usf.mercadointeligentespring.gateways.dto.PromotionDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionRepository extends CrudRepository<PromotionDTO, Long> {

}
