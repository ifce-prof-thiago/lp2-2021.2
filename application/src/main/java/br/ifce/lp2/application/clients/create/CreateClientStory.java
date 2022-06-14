package br.ifce.lp2.application.clients.create;

import br.ifce.lp2.domain.customer.CustomerGateway;
import org.springframework.stereotype.Component;

@Component
public record CreateClientStory(CustomerGateway gateway) implements ICreateClient {

    @Override
    public CreateClientOutput execute(CreateCustomerInput input) {
        return CreateClientOutput.from(gateway.save(input.toClient()));
    }

}
