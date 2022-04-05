package br.ifce.lp2.core.stories.clients;

import br.ifce.lp2.core.domain.Client;

import java.util.UUID;

public class CreateClientUS {

    public Client execute(Client client) {

        // Criptografar a senha do cliente
        // Verificar se exeste um cliente com o mesmo email
        // Salvar o cliente no banco de dados
        // Retornar o cliente salvo

        return client
                .setId(UUID.randomUUID().toString())
                .setPassword(client.getPassword().toUpperCase())
                .setEnabled(true);
    }

}
