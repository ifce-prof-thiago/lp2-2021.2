package br.ifce.lp2.application.products.create;

import br.ifce.lp2.domain.products.Product;

import java.util.ArrayList;
import java.util.List;

public class EventDispatcher<T> {

    private List<EventHandler> handlers = new ArrayList<>();

    public void register(EventHandler eventHandler) {
        handlers.add(eventHandler);
    }

    public void dispatch(Event<T> event) {
        for (final var handler : handlers) {
            handler.notify(event);
        }
    }

}
