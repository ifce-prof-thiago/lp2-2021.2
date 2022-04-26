package br.ifce.lp2.core.stories.clients.create;

import br.ifce.lp2.core.domain.Client;

public record CreateClientInput(String name, String email, String pass) {

    public Client toClient() {
        return Client.create(
                name,
                email,
                pass
        );
    }

}
