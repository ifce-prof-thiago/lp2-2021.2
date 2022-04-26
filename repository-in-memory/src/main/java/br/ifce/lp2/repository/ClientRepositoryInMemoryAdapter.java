package br.ifce.lp2.repository;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class ClientRepositoryInMemoryAdapter implements ClientRepositoryPort {
    
    private final static Map<String, Client> DATA_BASE = new HashMap<>();

    @Override
    public boolean exitsByEmail(String email) {
        return false;
    }

    @Override
    public Client save(Client client) {
        client.id(UUID.randomUUID().toString());
        
        DATA_BASE.put(client.id(), client);

        return client;
    }

    @Override
    public Optional<Client> getById(String id) {
        var client = DATA_BASE.get(id);

        return Optional.ofNullable(client);
    }

    @Override
    public List<Client> getAll() {
        return new ArrayList<>(DATA_BASE.values());
    }

    @Override
    public Client findById(String id) {
        return DATA_BASE.get(id);
    }

    public static Map<String, Client> getDataBase() {
        return DATA_BASE;
    }
}
