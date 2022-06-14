package br.ifce.lp2.domain.customer;

import java.util.List;
import java.util.Optional;

public interface CustomerGateway {

    boolean exitsByEmail(String email);

    Customer save(Customer client);

    Optional<Customer> findById(String id);
    <T> List<T> getAll(Class<T> projection);

    <T> List<T> findBy(CustomerQuery query, Class<T> projection);
}
