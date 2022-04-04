import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.in.clients.CreateClientPort;
import br.ifce.lp2.core.stories.clients.CreateClientUS;

public class Main {


    public static void main(String[] args) {

        CreateClientPort createClient = new CreateClientUS();

        var client = Client.create()
                .name("Thiago")
                .password("abxRt12")
                .email("thiago@lar.idu.br");

        client = createClient.execute(client);

        System.out.println(client.id());
        System.out.println(client.name());
        System.out.println(client.email());
        System.out.println(client.password());
        System.out.println(client.enabled());

    }

}
