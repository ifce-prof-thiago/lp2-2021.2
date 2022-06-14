package br.ifce.lp2.application.products.find.all;

import br.ifce.lp2.domain.products.ProductGateway;
import br.ifce.lp2.domain.products.ProductQuery;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class FindAllProductStory {

    private final ProductGateway gateway;

    public FindAllProductStory(ProductGateway gateway) {
        this.gateway = gateway;
    }

    public List<FindAllProductOutput> execute() {

        final var query = new ProductQuery(
                0,
                100,
                "",
                null,
                null,
                null,
                "asc",
                "name"
        );

        return gateway.findBy(query, FindAllProductOutput.class);
    }

}
