package br.ifce.lp2.core.ports.in.clients;

import br.ifce.lp2.core.domain.Product;

public interface CreateProductPort {

    Product execute(Product product);

}
