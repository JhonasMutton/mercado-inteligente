package br.edu.usf.mercadointeligentespring.controllers;

import br.edu.usf.mercadointeligentespring.core.domain.Promotion;
import br.edu.usf.mercadointeligentespring.core.usecase.promotion.CreatePromotion;
import br.edu.usf.mercadointeligentespring.core.usecase.promotion.DeletePromotion;
import br.edu.usf.mercadointeligentespring.core.usecase.promotion.FindPromotionById;
import br.edu.usf.mercadointeligentespring.core.usecase.promotion.FindPromotions;
import br.edu.usf.mercadointeligentespring.core.usecase.promotion.UpdatePromotion;
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
@RequestMapping("/promotions")
public class PromotionController {
    private final CreatePromotion createPromotion;
    private final DeletePromotion deletePromotion;
    private final UpdatePromotion updatePromotion;
    private final FindPromotions findPromotions;
    private final FindPromotionById findPromotionById;

    @PostMapping
    public Promotion create(@RequestBody Promotion Promotion) {
        return createPromotion.execute(Promotion);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deletePromotion.execute(id);
    }

    @GetMapping("/{id}")
    public Promotion findPromotionById(@PathVariable Long id) {
        return findPromotionById.execute(id);
    }

    @PutMapping("/{id}")
    public Promotion updatePromotion(@PathVariable Long id, @RequestBody Promotion Promotion) {
        return updatePromotion.execute(id, Promotion);
    }

    @GetMapping
    public List<Promotion> findPromotions() {
        return findPromotions.execute();
    }

}
