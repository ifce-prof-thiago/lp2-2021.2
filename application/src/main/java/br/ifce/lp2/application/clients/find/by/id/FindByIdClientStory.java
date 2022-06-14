package br.ifce.lp2.application.clients.find.by.id;

import br.ifce.lp2.domain.customer.CustomerGateway;
import org.springframework.stereotype.Component;

@Component
public record FindByIdClientStory(CustomerGateway gateway) implements IFindByIdClient {
    @Override
    public FindByIdOutput execute(String id) {
        return FindByIdOutput.fromClient(gateway.findById(id).get());
    }

}
