package br.ifce.lp2.domain.products;

import java.math.BigDecimal;

public record ProductQuery(
        String page,
        String perPage,
        String search,
        BigDecimal minPrice,
        BigDecimal maxPrice,
        long limitQtyInventory,
        String limitQtyInventoryDirection,
        String direction,
        String sortBy) {

}
