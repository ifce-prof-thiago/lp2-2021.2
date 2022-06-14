package br.ifce.lp2.domain.customer;

public record CustomerQuery(
        int page,
        int perPage,
        String search,
        String direction,
        String sortBy) {
}
