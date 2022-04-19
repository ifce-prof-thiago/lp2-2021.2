package br.ifce.lp2.api.controller.clients;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.stories.clients.CreateClientStory;
import br.ifce.lp2.core.stories.clients.GetAllClientsStory;
import br.ifce.lp2.core.stories.clients.GetClientByIdStory;
import br.ifce.lp2.repository.ClientRepositoryInMemoryAdapter;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("clients")
@RestController
public class ClientController {

    @PostMapping
    public Client post(@RequestBody Client client) {
        return new CreateClientStory(new ClientRepositoryInMemoryAdapter()).execute(client);
    }

    @GetMapping
    public List<Client> getAll() {
        return new GetAllClientsStory(new ClientRepositoryInMemoryAdapter()).execute();
    }

    @GetMapping("{id}")
    public Client getById(@PathVariable String id) {
        return new GetClientByIdStory(new ClientRepositoryInMemoryAdapter()).execute(id);
    }
}
