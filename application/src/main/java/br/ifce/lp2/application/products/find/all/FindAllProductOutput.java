package br.ifce.lp2.application.products.find.all;

import br.ifce.lp2.domain.products.Product;

public record FindAllProductOutput(String id, String name) {

    public static FindAllProductOutput from(Product product) {
        return new FindAllProductOutput(
                product.id(),
                product.name()
        );
    }

}
