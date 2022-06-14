package br.ifce.lp2.products;

import br.ifce.lp2.domain.products.Product;
import br.ifce.lp2.domain.products.ProductGateway;
import br.ifce.lp2.domain.products.ProductQuery;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ProductMongoGateway implements ProductGateway {

    private final static String COLLECTION_NAME = "product";

    private final MongoOperations mongoOperations;

    public ProductMongoGateway(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

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
        return mongoOperations.findAll(projection, COLLECTION_NAME);
    }
}
