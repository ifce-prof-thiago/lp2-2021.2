package br.ifce.lp2.application.clients.create;

import br.ifce.lp2.domain.customer.Customer;

public record CreateClientOutput(String id, String email, String name) {

    public static CreateClientOutput from(Customer client) {
        return new CreateClientOutput(
                client.id(),
                client.email(),
                client.name()
        );
    }

}
