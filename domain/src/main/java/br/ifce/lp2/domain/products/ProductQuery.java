package br.ifce.lp2.domain.products;

import java.math.BigDecimal;

public record ProductQuery(
        long page,
        long perPage,
        String search,
        BigDecimal minPrice,
        BigDecimal maxPrice,
        String limitQtyInventoryDirection,
        String direction,
        String sortBy) {

}
