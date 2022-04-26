package br.ifce.lp2.core.stories.clients.find.by.id;

import br.ifce.lp2.core.domain.Client;

public record FindByIdOutput(String id, String email, String name, boolean enabled) {

    public static FindByIdOutput fromClient(Client client) {
        return new FindByIdOutput(
                client.id(),
                client.email(),
                client.name(),
                client.enabled()
        );
    }
}
