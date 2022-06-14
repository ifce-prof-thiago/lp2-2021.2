package br.ifce.lp2.application.products.create;

import br.ifce.lp2.domain.products.Product;

public interface EventHandler<T> {
    void notify(Event<T> event);

}
