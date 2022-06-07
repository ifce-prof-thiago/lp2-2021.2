package br.ifce.lp2.domain.clients;

import java.util.List;
import java.util.Optional;

public interface ClientGateway {

    boolean exitsByEmail(String email);

    Client save(Client client);

    Optional<Client> findById(String id);
    <T> List<T> getAll(Class<T> projection);

    <T> List<T> findBy(ClientQuery query, Class<T> projection);
}
