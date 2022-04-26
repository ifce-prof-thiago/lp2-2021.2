package br.ifce.lp2.core.stories.clients.create;

import br.ifce.lp2.core.domain.Client;

public record CreateClientOutput(String id, String email, String name) {

    public static CreateClientOutput fromClient(Client client) {
        return new CreateClientOutput(
                client.id(),
                client.email(),
                client.name()
        );
    }

}
