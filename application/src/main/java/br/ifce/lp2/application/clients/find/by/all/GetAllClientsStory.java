package br.ifce.lp2.application.clients.find.by.all;

import br.ifce.lp2.domain.clients.ClientGateway;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public record GetAllClientsStory(ClientGateway gateway) {

    public List<FindClientAllOutput> execute() {

        return gateway.getAll(FindClientAllOutput.class);

    }

}
