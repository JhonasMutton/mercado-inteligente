package br.edu.usf.mercadointeligentespring.controllers;

import br.edu.usf.mercadointeligentespring.core.domain.PopularProduct;
import br.edu.usf.mercadointeligentespring.core.domain.Product;

import br.edu.usf.mercadointeligentespring.core.usecase.populate.PopulateInteractions;
import br.edu.usf.mercadointeligentespring.core.usecase.populate.PopulateProducts;
import br.edu.usf.mercadointeligentespring.core.usecase.product.DeleteProduct;
import br.edu.usf.mercadointeligentespring.core.usecase.product.FindProductById;
import br.edu.usf.mercadointeligentespring.core.usecase.product.FindProducts;
import br.edu.usf.mercadointeligentespring.core.usecase.product.UpdateProduct;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/populate")
public class PopulateController {
    private final PopulateProducts populateProducts;
    private final PopulateInteractions populateInteractions;

    @PostMapping
    public void create(@RequestBody PopularProduct popularProduct) {
        populateProducts.execute(popularProduct.getCategories(), popularProduct.getSize());
    }

    @PostMapping("/interactions")
    public void create() {
        populateInteractions.execute();
    }
}
