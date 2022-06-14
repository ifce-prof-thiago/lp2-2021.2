package br.ifce.lp2.application.clients.find.by.id;

import br.ifce.lp2.domain.customer.Customer;

public record FindByIdOutput(String id, String email, String name, boolean enabled) {

    public static FindByIdOutput fromClient(Customer client) {
        return new FindByIdOutput(
                client.id(),
                client.email(),
                client.name(),
                client.enabled()
        );
    }
}
