package br.ifce.lp2.application.clients.find.by.filter;

import br.ifce.lp2.domain.clients.ClientGateway;
import br.ifce.lp2.domain.clients.ClientQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record FilterClientsStory(ClientGateway gateway) {

    public List<FilterClientOutput> execute(ClientQuery input) {
        return gateway.findBy(input, FilterClientOutput.class);
    }
}
