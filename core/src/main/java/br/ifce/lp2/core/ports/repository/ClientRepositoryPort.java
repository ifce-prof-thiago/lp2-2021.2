package br.ifce.lp2.core.ports.repository;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.stories.clients.find.by.all.FindClientAllOutput;
import br.ifce.lp2.core.stories.clients.find.by.filter.FilterClientInput;
import br.ifce.lp2.core.stories.clients.find.by.filter.FilterClientOutput;

import java.util.List;
import java.util.Optional;

public interface ClientRepositoryPort {

    boolean exitsByEmail(String email);

    Client save(Client client);

    Optional<Client> findById(String id);
    <T> List<T> getAll(Class<T> projection);

    <T> List<T> findBy(FilterClientInput input, Class<T> projection);
}
