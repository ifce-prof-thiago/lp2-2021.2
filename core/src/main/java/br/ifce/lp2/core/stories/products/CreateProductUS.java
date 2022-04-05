package br.ifce.lp2.core.stories.products;

import br.ifce.lp2.core.domain.Product;
import br.ifce.lp2.core.ports.in.products.CreateProductPort;

import java.util.UUID;

public class CreateProductUS implements CreateProductPort {


    @Override
    public Product execute(Product product) {
        return product
                .id(UUID.randomUUID().toString());
    }
}
