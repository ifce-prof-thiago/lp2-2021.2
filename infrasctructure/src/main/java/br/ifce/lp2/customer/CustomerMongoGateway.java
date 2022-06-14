package br.ifce.lp2.customer;

import br.ifce.lp2.domain.customer.Customer;
import br.ifce.lp2.domain.customer.CustomerGateway;
import br.ifce.lp2.domain.customer.CustomerQuery;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class CustomerMongoGateway implements CustomerGateway {

    @Override
    public boolean exitsByEmail(String email) {
        return false;
    }

    @Override
    public Customer save(Customer client) {
        return null;
    }

    @Override
    public Optional<Customer> findById(String id) {
        return Optional.empty();
    }

    @Override
    public <T> List<T> getAll(Class<T> projection) {
        return null;
    }

    @Override
    public <T> List<T> findBy(CustomerQuery query, Class<T> projection) {
        return null;
    }
}
