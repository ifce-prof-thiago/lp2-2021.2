package br.ifce.lp2.core.stories.clients.find.by.id;

import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public record FindByIdClientStory(ClientRepositoryPort repository) implements IFindByIdClient {

    @Override
    public FindByIdOutput execute(String id) {
        return FindByIdOutput.fromClient(repository.findById(id));
    }

}
