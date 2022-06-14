package br.ifce.lp2.application.products.create;

import br.ifce.lp2.domain.products.Product;

public class SendEmailWhenProductIsCreatedHandler implements EventHandler<Product> {

    public void notify(Event<Product> event) {

        System.out.println("Send email: " + event.data().id());
        System.out.println("Instant: " + event.instant());

    }

}
