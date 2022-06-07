package br.ifce.lp2.application.products;

import br.ifce.lp2.domain.products.Product;

import java.util.UUID;

public class CreateProductUS {

    public Product execute(Product product) {
        return product
                .id(UUID.randomUUID().toString());
    }
}
