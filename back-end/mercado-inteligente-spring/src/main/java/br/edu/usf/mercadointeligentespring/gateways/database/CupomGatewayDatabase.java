package br.edu.usf.mercadointeligentespring.gateways.database;

import br.edu.usf.mercadointeligentespring.gateways.CupomGateway;
import br.edu.usf.mercadointeligentespring.gateways.database.repository.CupomRepository;
import br.edu.usf.mercadointeligentespring.gateways.dto.CupomDTO;
import java.util.List;
import java.util.Optional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
class CupomGatewayDatabase implements CupomGateway {

    private final CupomRepository productRepository;

    @Override
    public CupomDTO create(CupomDTO Cupom) {
        return productRepository.save(Cupom);
    }

    @Override
    public CupomDTO update(String code, CupomDTO CupomDTO) {
        CupomDTO.setCode(code);
        return productRepository.save(CupomDTO);
    }

    @Override
    public void delete(Long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Optional<CupomDTO> findById(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public List<CupomDTO> findAll() {
        return (List<CupomDTO>) productRepository.findAll();
    }
}
