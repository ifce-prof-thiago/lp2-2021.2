package br.ifce.lp2.core.stories.clients;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;

import java.util.List;

public record GetAllClientsStory(ClientRepositoryPort repository) {

    public List<Client> execute() {
        return repository.getAll();
    }

}
