package br.edu.usf.mercadointeligentespring.controllers;

import br.edu.usf.mercadointeligentespring.core.domain.Product;

import br.edu.usf.mercadointeligentespring.core.usecase.product.CreateProduct;
import br.edu.usf.mercadointeligentespring.core.usecase.product.DeleteProduct;
import br.edu.usf.mercadointeligentespring.core.usecase.product.FindProductById;
import br.edu.usf.mercadointeligentespring.core.usecase.product.FindProducts;
import br.edu.usf.mercadointeligentespring.core.usecase.product.UpdateProduct;
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
@RequestMapping("/products")
public class ProductController {
    private final CreateProduct createProduct;
    private final DeleteProduct deleteProduct;
    private final UpdateProduct updateProduct;
    private final FindProducts findProducts;
    private final FindProductById findProductById;

    @PostMapping
    public Product create(@RequestBody Product Product) {
        return createProduct.execute(Product);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        deleteProduct.execute(id);
    }

    @GetMapping("/{id}")
    public Product findProductById(@PathVariable Long id) {
        return findProductById.execute(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable Long id, @RequestBody Product Product) {
        return updateProduct.execute(id, Product);
    }

    @GetMapping
    public List<Product> findProducts() {
        return findProducts.execute();
    }

}
