package br.ifce.lp2.application.products.create;

import br.ifce.lp2.domain.products.Product;

import java.math.BigDecimal;

public record CreateProductInput(
        String name,
        String description,
        BigDecimal price,
        long quantity) {

    public Product toProduct() {
        return Product.create(
                name,
                description,
                price,
                quantity
        );
    }
}
