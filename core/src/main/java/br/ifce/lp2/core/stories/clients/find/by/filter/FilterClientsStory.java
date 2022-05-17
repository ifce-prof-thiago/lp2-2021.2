package br.ifce.lp2.core.stories.clients.find.by.filter;

import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record FilterClientsStory(ClientRepositoryPort repository) {

    public List<FilterClientOutput> execute(FilterClientInput input) {
        return repository.findBy(input, FilterClientOutput.class);
    }
}
