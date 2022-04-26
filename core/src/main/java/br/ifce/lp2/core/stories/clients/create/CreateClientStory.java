package br.ifce.lp2.core.stories.clients.create;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;
import org.springframework.stereotype.Component;

@Component
public record CreateClientStory(ClientRepositoryPort repository) implements ICreateClient {

    @Override
    public CreateClientOutput execute(CreateClientInput input) {
        return CreateClientOutput.fromClient(repository.save(input.toClient()));
    }

}
