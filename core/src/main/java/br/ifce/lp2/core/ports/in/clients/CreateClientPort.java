package br.ifce.lp2.core.ports.in.clients;

import br.ifce.lp2.core.domain.Client;

public interface CreateClientPort {

    Client execute(Client client);

}
