package br.ifce.lp2.repository.products;

import br.ifce.lp2.domain.products.Product;
import br.ifce.lp2.domain.products.ProductGateway;
import br.ifce.lp2.domain.products.ProductQuery;
import br.ifce.lp2.repository.connection.MongoConnection;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MongoProductGateway implements ProductGateway {

    private final static String COLLECTION_NAME = "product";

    private static MongoOperations mongoOperations = MongoConnection.getConnection();

    @Override
    public Product save(Product product) {
        return mongoOperations.save(product);
    }

    @Override
    public Optional<Product> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public <T> List<T> findBy(ProductQuery query, Class<T> projection) {
        return null;
    }
}
