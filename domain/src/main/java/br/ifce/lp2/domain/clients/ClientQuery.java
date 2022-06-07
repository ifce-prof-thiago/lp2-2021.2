package br.ifce.lp2.domain.clients;

public record ClientQuery(
        int page,
        int perPage,
        String search,
        String direction,
        String sortBy) {
}
