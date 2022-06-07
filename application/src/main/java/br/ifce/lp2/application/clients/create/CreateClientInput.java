package br.ifce.lp2.application.clients.create;

import br.ifce.lp2.domain.clients.Client;

public record CreateClientInput(String name, String email, String pass) {

    public Client toClient() {
        return Client.create(
                name,
                email,
                pass
        );
    }

}
