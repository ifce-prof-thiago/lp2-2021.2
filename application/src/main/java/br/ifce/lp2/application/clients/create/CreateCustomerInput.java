package br.ifce.lp2.application.clients.create;

import br.ifce.lp2.domain.customer.Customer;

public record CreateCustomerInput(String name, String email, String pass) {

    public Customer toClient() {
        return Customer.create(
                name,
                email,
                pass
        );
    }

}
