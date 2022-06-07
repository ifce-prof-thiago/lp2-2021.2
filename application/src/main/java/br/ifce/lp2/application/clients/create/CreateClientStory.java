package br.ifce.lp2.application.clients.create;

import br.ifce.lp2.domain.clients.ClientGateway;
import org.springframework.stereotype.Component;

@Component
public record CreateClientStory(ClientGateway gateway) implements ICreateClient {

    @Override
    public CreateClientOutput execute(CreateClientInput input) {
        return CreateClientOutput.from(gateway.save(input.toClient()));
    }

}
