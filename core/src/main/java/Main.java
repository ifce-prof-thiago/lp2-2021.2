import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.domain.Product;
import br.ifce.lp2.core.stories.clients.CreateClientUS;
import br.ifce.lp2.core.stories.products.CreateProductUS;

import java.math.BigDecimal;

public class Main {


    public static void main(String[] args) {

        var createClient = new CreateClientUS();

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

        var createProduct = new CreateProductUS();

        var product = Product.create()
                .title("Notebook")
                .price(BigDecimal.valueOf(5999.99))
                .qtyInventory(1000);

        product = createProduct.execute(product);

        System.out.println(product.id());
        System.out.println(product.title());
        System.out.println(product.price());
        System.out.println(product.qtyInventory());

    }

}
