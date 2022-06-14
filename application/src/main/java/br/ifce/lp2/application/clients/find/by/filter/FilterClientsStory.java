package br.ifce.lp2.application.clients.find.by.filter;

import br.ifce.lp2.domain.customer.CustomerGateway;
import br.ifce.lp2.domain.customer.CustomerQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record FilterClientsStory(CustomerGateway gateway) {

    public List<FilterClientOutput> execute(CustomerQuery input) {
        return gateway.findBy(input, FilterClientOutput.class);
    }
}
