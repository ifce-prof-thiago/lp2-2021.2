package br.ifce.lp2.core.stories.clients;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;

public record GetClientByIdStory(ClientRepositoryPort repository) {

    public Client execute(String id) {
        return repository.findById(id);
    }
}
