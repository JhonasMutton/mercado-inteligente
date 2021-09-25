package br.edu.usf.mercadointeligentespring.gateways.database.repository;

import br.edu.usf.mercadointeligentespring.gateways.dto.CupomDTO;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CupomRepository extends CrudRepository<CupomDTO, Long> {

}
