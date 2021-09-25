package br.edu.usf.mercadointeligentespring.core.usecase.cupom;

import br.edu.usf.mercadointeligentespring.core.domain.Cupom;
import br.edu.usf.mercadointeligentespring.core.mapper.CupomMapper;
import br.edu.usf.mercadointeligentespring.gateways.CupomGateway;
import java.util.List;
import java.util.stream.Collectors;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class FindCupons {

    private final CupomGateway userGateway;

    private final CupomMapper userMapper;

    public List<Cupom> execute() {
        return userGateway.findAll()
            .stream()
            .map(userMapper::toDomain)
            .collect(Collectors.toList());
    }
}
