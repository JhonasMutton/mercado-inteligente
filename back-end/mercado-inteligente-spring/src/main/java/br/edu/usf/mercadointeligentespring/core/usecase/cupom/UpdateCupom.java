package br.edu.usf.mercadointeligentespring.core.usecase.cupom;

import br.edu.usf.mercadointeligentespring.core.domain.Cupom;
import br.edu.usf.mercadointeligentespring.core.mapper.CupomMapper;
import br.edu.usf.mercadointeligentespring.gateways.CupomGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class UpdateCupom {

    private final CupomGateway userGateway;

    private final CupomMapper userMapper;

    public Cupom execute(String code, Cupom user) {
        var userUpdated = userGateway.update(code, userMapper.toDTO(user));
        return userMapper.toDomain(userUpdated);
    }
}
