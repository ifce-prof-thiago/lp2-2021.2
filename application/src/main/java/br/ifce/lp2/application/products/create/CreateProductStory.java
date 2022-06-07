package br.ifce.lp2.application.products.create;

import br.ifce.lp2.domain.products.Product;
import br.ifce.lp2.domain.products.ProductGateway;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public record CreateProductStory(ProductGateway gateway) {

    public CreateProductOutput execute(CreateProductInput input) {
        final var productSaved = gateway.save(input.toProduct());
        // TODO: criar um evento para notificar que o produto foi criado

        return CreateProductOutput.from(productSaved);
    }
}
