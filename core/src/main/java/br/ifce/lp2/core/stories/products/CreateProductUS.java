package br.ifce.lp2.core.stories.products;

import br.ifce.lp2.core.domain.Product;

import java.util.UUID;

public class CreateProductUS {

    public Product execute(Product product) {
        return product
                .id(UUID.randomUUID().toString());
    }
}
