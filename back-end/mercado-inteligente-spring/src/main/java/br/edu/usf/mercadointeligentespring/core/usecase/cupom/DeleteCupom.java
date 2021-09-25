package br.edu.usf.mercadointeligentespring.core.usecase.cupom;

import br.edu.usf.mercadointeligentespring.core.mapper.CupomMapper;
import br.edu.usf.mercadointeligentespring.gateways.CupomGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class DeleteCupom {

    private final CupomGateway CupomGateway;

    private final CupomMapper CupomMapper;

    public void execute(Long id) {
        CupomGateway.delete(id);
    }
}
