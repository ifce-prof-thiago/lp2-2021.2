package br.ifce.lp2.api.controller.clients;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.stories.clients.GetAllClientsStory;
import br.ifce.lp2.core.stories.clients.create.CreateClientInput;
import br.ifce.lp2.core.stories.clients.create.CreateClientOutput;
import br.ifce.lp2.core.stories.clients.create.ICreateClient;
import br.ifce.lp2.core.stories.clients.find.by.id.FindByIdOutput;
import br.ifce.lp2.core.stories.clients.find.by.id.IFindByIdClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("clients")
@RestController
public record ClientController(
        ICreateClient createClientStory,
        GetAllClientsStory getAllClientsStory,
        IFindByIdClient findByIdClient) {

    @PostMapping
    public CreateClientOutput post(@RequestBody CreateClientInput input) {
        return createClientStory.execute(input);
    }

    @GetMapping
    public List<Client> getAll() {
        return getAllClientsStory.execute();
    }

    @GetMapping("{id}")
    public FindByIdOutput getById(@PathVariable String id) {
        return findByIdClient.execute(id);
    }

}
