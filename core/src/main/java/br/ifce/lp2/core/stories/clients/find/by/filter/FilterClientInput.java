package br.ifce.lp2.core.stories.clients.find.by.filter;

public record FilterClientInput(
        int page,
        int perPage,
        String search,
        String direction,
        String sortBy) {
}
