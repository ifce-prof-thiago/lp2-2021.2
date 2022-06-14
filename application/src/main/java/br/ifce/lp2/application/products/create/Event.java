package br.ifce.lp2.application.products.create;

import java.time.Instant;

public class Event<T> {

    private Instant instant;
    private T data;

    public Event(T data) {
        this.data = data;
        this.instant = Instant.now();
    }

    public T data() {
        return data;
    }

    public Instant instant() {
        return instant;
    }

}
