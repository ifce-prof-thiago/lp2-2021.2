package br.ifce.lp2.api;

import br.ifce.lp2.application.clients.create.CreateCustomerInput;
import br.ifce.lp2.application.clients.create.CreateClientOutput;
import br.ifce.lp2.application.clients.create.ICreateClient;
import br.ifce.lp2.application.clients.find.by.filter.FilterClientOutput;
import br.ifce.lp2.application.clients.find.by.filter.FilterClientsStory;
import br.ifce.lp2.application.clients.find.by.id.FindByIdOutput;
import br.ifce.lp2.application.clients.find.by.id.IFindByIdClient;
import br.ifce.lp2.domain.customer.CustomerQuery;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("customers")
@RestController
public record CustomerController(
        ICreateClient createClientStory,
        FilterClientsStory filterClientsStory,
        IFindByIdClient findByIdClient) {

    @PostMapping
    public CreateClientOutput post(@RequestBody CreateCustomerInput input) {
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

        final var input = new CustomerQuery(
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
