package br.ifce.lp2.application.clients.find.by.all;

import br.ifce.lp2.domain.customer.CustomerGateway;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record GetAllClientsStory(CustomerGateway gateway) {

    public List<FindClientAllOutput> execute() {

        return gateway.getAll(FindClientAllOutput.class);

    }

}
