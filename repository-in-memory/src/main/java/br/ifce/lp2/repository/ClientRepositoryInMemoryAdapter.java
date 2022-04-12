package br.ifce.lp2.repository;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public class ClientRepositoryInMemoryAdapter implements ClientRepositoryPort {
    
    private final static Map<String, Client> DATA_BASE = new HashMap<>();

    @Override
    public boolean exitsByEmail(String email) {
        return false;
    }

    @Override
    public Client save(Client client) {
        client.setId(UUID.randomUUID().toString());
        
        DATA_BASE.put(client.getId(), client);

        return client;
    }

    @Override
    public Optional<Client> getById(String id) {
        var client = DATA_BASE.get(id);

        return Optional.ofNullable(client);
    }

    public static Map<String, Client> getDataBase() {
        return DATA_BASE;
    }
}
