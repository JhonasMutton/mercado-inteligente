package br.edu.usf.mercadointeligentespring.core.usecase.cupom;

import br.edu.usf.mercadointeligentespring.core.domain.Cupom;
import br.edu.usf.mercadointeligentespring.core.mapper.CupomMapper;
import br.edu.usf.mercadointeligentespring.gateways.CupomGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CreateCupom {

    private final CupomGateway CupomGateway;

    private final CupomMapper CupomMapper;

    public Cupom execute(Cupom Cupom) {
        var CupomSaved = CupomGateway.create(CupomMapper.toDTO(Cupom));
        return CupomMapper.toDomain(CupomSaved);
    }
}
