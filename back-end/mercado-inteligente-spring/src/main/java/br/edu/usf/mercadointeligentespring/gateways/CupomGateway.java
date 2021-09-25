package br.edu.usf.mercadointeligentespring.gateways;

import br.edu.usf.mercadointeligentespring.gateways.dto.CupomDTO;
import java.util.List;
import java.util.Optional;

public interface CupomGateway {
    CupomDTO create(CupomDTO CupomDTO);

    CupomDTO update(String code, CupomDTO CupomDTO);

    void delete(Long id);

    Optional<CupomDTO> findById(Long id);

    List<CupomDTO> findAll();
}
