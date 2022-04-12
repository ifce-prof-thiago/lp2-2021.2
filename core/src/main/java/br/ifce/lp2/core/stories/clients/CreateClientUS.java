package br.ifce.lp2.core.stories.clients;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;

public record CreateClientUS(ClientRepositoryPort repository) {

    public Client execute(Client client) {

        // Criptografar a senha do cliente

        // Verificar se existe um cliente com o mesmo email
        // Salvar o cliente no banco de dados
        // Enviar um e-mail com o token de ativação do cliente
        // Retornar o cliente salvo

        client.setEnabled(false);

        return repository.save(client);

    }

}
