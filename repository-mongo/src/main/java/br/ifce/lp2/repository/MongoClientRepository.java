package br.ifce.lp2.repository;

import br.ifce.lp2.core.domain.Client;
import br.ifce.lp2.core.ports.repository.ClientRepositoryPort;
import br.ifce.lp2.core.stories.clients.find.by.filter.FilterClientInput;
import com.mongodb.client.MongoClients;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.Optional;

import static org.springframework.data.mongodb.core.query.Criteria.where;

@Component
public record MongoClientRepository() implements ClientRepositoryPort {

    private final static String COLLECTION_NAME = "client";

    private static MongoOperations mongoOperations =
            new MongoTemplate(
                    MongoClients.create(
                            "mongodb+srv://lp2:dzsFtjcWVm9WZFe0@cluster0.0dxsu.mongodb.net"
                    ), "lp2"
            );

    @Override
    public boolean exitsByEmail(String email) {

        final var query = new Query(where("email").is(email));

        return mongoOperations.exists(query, COLLECTION_NAME);

    }

    @Override
    public Client save(Client client) {
        return mongoOperations.save(client);
    }

    @Override
    public Optional<Client> findById(String id) {

        final var query = new Query(where("_id").is(id));

        return mongoOperations.find(query, Client.class, COLLECTION_NAME).stream().findFirst();

    }

    @Override
    public <T> List<T> getAll(Class<T> projection) {

        final var query = new Query();
        return mongoOperations.find(query, projection, COLLECTION_NAME);

    }

    @Override
    public <T> List<T> findBy(FilterClientInput input, Class<T> projection) {

        final var page = PageRequest.of(
                input.page(),
                input.perPage(),
                Sort.by(Sort.Direction.fromString(input.direction()), input.sortBy())
        );

        final var query = new Query().with(page);

        if (StringUtils.hasLength(input.search())) {

            final var pattern = input.search();

            final var where = where("enabled").is(false)
                    .orOperator(
                            where("name").regex(pattern, "i"),
                            where("email").regex(pattern, "i")
                    );

            query.addCriteria(where);

        }

        return mongoOperations.find(query, projection, COLLECTION_NAME);
    }

}
