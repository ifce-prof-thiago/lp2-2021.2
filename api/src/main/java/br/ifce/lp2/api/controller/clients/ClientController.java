package br.ifce.lp2.api.controller.clients;

import br.ifce.lp2.core.stories.clients.find.by.all.FindClientAllOutput;
import br.ifce.lp2.core.stories.clients.find.by.all.GetAllClientsStory;
import br.ifce.lp2.core.stories.clients.create.CreateClientInput;
import br.ifce.lp2.core.stories.clients.create.CreateClientOutput;
import br.ifce.lp2.core.stories.clients.create.ICreateClient;
import br.ifce.lp2.core.stories.clients.find.by.filter.FilterClientInput;
import br.ifce.lp2.core.stories.clients.find.by.filter.FilterClientOutput;
import br.ifce.lp2.core.stories.clients.find.by.filter.FilterClientsStory;
import br.ifce.lp2.core.stories.clients.find.by.id.FindByIdOutput;
import br.ifce.lp2.core.stories.clients.find.by.id.IFindByIdClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("clients")
@RestController
public record ClientController(
        ICreateClient createClientStory,
        FilterClientsStory filterClientsStory,
        IFindByIdClient findByIdClient) {

    @PostMapping
    public CreateClientOutput post(@RequestBody CreateClientInput input) {
        return createClientStory.execute(input);
    }

    @GetMapping
    public List<FilterClientOutput> getAll(
            @RequestParam(defaultValue = "0") final int page,
            @RequestParam(defaultValue = "10") final int perPage,
            @RequestParam(defaultValue = "") final String search,
            @RequestParam(defaultValue = "asc") final String direction,
            @RequestParam(defaultValue = "name") final String sortBy
    ) {

        final var input = new FilterClientInput(
                page,
                perPage,
                search,
                direction,
                sortBy
        );

        return filterClientsStory.execute(input);
    }

    @GetMapping("{id}")
    public FindByIdOutput getById(@PathVariable String id) {
        return findByIdClient.execute(id);
    }

}
