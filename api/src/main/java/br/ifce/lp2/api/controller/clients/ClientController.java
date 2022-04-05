package br.ifce.lp2.api.controller.clients;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.stories.clients.CreateClientUS;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("clients")
@RestController
public class ClientController {

    @GetMapping
    public Client get() {

        var client = Client.create()
                .setName("Thiago")
                .setPassword("AbFcQqqq")
                .setEmail("thiago@lar.ifce.edu.br");

        return new CreateClientUS().execute(client);
    }

}
