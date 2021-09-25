package br.edu.usf.mercadointeligentespring.controllers;

import br.edu.usf.mercadointeligentespring.core.domain.Cupom;

import br.edu.usf.mercadointeligentespring.core.usecase.cupom.CreateCupom;
import br.edu.usf.mercadointeligentespring.core.usecase.cupom.DeleteCupom;
import br.edu.usf.mercadointeligentespring.core.usecase.cupom.FindCupomById;
import br.edu.usf.mercadointeligentespring.core.usecase.cupom.FindCupons;
import br.edu.usf.mercadointeligentespring.core.usecase.cupom.UpdateCupom;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/cupons")
public class CupomController {
    private final CreateCupom createCupom;
    private final DeleteCupom deleteCupom;
    private final UpdateCupom updateCupom;
    private final FindCupons findCupons;
    private final FindCupomById findCupomById;

    @PostMapping
    public Cupom create(@RequestBody Cupom Cupom) {
        return createCupom.execute(Cupom);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deleteCupom.execute(id);
    }

    @GetMapping("/{id}")
    public Cupom findCupomById(@PathVariable Long id) {
        return findCupomById.execute(id);
    }

    @PutMapping("/{code}")
    public Cupom updateCupom(@PathVariable String code, @RequestBody Cupom Cupom) {
        return updateCupom.execute(code, Cupom);
    }

    @GetMapping
    public List<Cupom> findCupons() {
        return findCupons.execute();
    }

}
