package br.ifce.lp2.application.products.create;

import br.ifce.lp2.domain.products.Product;

public record CreateProductOutput(String id) {

    public static CreateProductOutput from(Product product) {
        return new CreateProductOutput(
                product.id()
        );
    }

}
