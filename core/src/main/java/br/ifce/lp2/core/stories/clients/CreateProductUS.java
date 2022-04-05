package br.ifce.lp2.core.stories.clients;

import br.ifce.lp2.core.domain.Product;
import br.ifce.lp2.core.ports.in.clients.CreateProductPort;

import java.util.UUID;

public class CreateProductUS implements CreateProductPort {


    @Override
    public Product execute(Product product) {
        return product
                .id(UUID.randomUUID().toString());
    }
}
