package br.edu.usf.mercadointeligentespring.core.usecase.cupom;

import br.edu.usf.mercadointeligentespring.core.domain.Cupom;
import br.edu.usf.mercadointeligentespring.core.mapper.CupomMapper;
import br.edu.usf.mercadointeligentespring.gateways.CupomGateway;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindCupomById {


    private final CupomGateway CupomGateway;

    private final CupomMapper CupomMapper;

    public Cupom execute(Long id) {
        return CupomMapper.toDomain(CupomGateway.findById(id).orElseThrow(() -> new EntityNotFoundException("Cupom not found")));
    }
}
