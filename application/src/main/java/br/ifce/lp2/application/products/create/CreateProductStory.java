package br.ifce.lp2.application.products.create;

import br.ifce.lp2.domain.products.Product;
import br.ifce.lp2.domain.products.ProductGateway;
import org.springframework.stereotype.Component;

@Component
public record CreateProductStory(ProductGateway gateway) {

    public CreateProductOutput execute(CreateProductInput input) {
        final var productSaved = gateway.save(input.toProduct());

        // TODO: criar um evento para notificar que o produto foi criado
        final var dispatcher = new EventDispatcher();

        final var handler = new NotifyAdminWhenProductIsCtreatedHandler();
        final var handler2 = new SendEmailWhenProductIsCreatedHandler();

        dispatcher.register(handler);
        dispatcher.register(handler2);

        final var event = new Event(productSaved);

        dispatcher.dispatch(event);

        return CreateProductOutput.from(productSaved);
    }
}
