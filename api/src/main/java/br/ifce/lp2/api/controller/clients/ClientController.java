package br.ifce.lp2.api.controller.clients;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.stories.clients.CreateClientUS;
import br.ifce.lp2.repository.ClientRepositoryInMemoryAdapter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RequestMapping("clients")
@RestController
public class ClientController {

    @GetMapping
    public Client get(Client client) {
        return new CreateClientUS(new ClientRepositoryInMemoryAdapter()).execute(client);
    }

    @GetMapping("db")
    public Map<String, Client> getDatabase() {
        return ClientRepositoryInMemoryAdapter.getDataBase();
    }

}
