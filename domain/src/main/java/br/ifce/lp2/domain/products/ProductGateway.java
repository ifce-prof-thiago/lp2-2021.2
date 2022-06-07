package br.ifce.lp2.domain.products;

import br.ifce.lp2.domain.clients.ClientQuery;

import java.util.List;
import java.util.Optional;

public interface ProductGateway {

    Product save(Product product);

    Optional<Product> findById(Long id);

    <T> List<T> findBy(ProductQuery query, Class<T> projection);

}
