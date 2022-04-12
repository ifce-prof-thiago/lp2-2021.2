package br.ifce.lp2.core.ports.repository;

import br.ifce.lp2.core.domain.Client;

import java.util.Optional;

public interface ClientRepositoryPort {

    boolean exitsByEmail(String email);

    Client save(Client client);

    Optional<Client> getById(String id);

}
