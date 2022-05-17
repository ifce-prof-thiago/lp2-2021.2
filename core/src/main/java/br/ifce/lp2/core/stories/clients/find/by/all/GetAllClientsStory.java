package br.ifce.lp2.core.stories.clients.find.by.all;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record GetAllClientsStory(ClientRepositoryPort repository) {

    public List<FindClientAllOutputV2> execute() {

        return repository.getAll(FindClientAllOutputV2.class);

    }

}
