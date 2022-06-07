package br.ifce.lp2.application.clients.find.by.id;

import br.ifce.lp2.domain.clients.ClientGateway;
import org.springframework.stereotype.Component;

@Component
public record FindByIdClientStory(ClientGateway gateway) implements IFindByIdClient {
    @Override
    public FindByIdOutput execute(String id) {
        return FindByIdOutput.fromClient(gateway.findById(id).get());
    }

}
