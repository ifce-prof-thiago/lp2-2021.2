package br.ifce.lp2.application.clients.create;

import br.ifce.lp2.domain.clients.Client;

public record CreateClientOutput(String id, String email, String name) {

    public static CreateClientOutput from(Client client) {
        return new CreateClientOutput(
                client.id(),
                client.email(),
                client.name()
        );
    }

}
