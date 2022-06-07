package br.ifce.lp2.domain.products;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

@Getter
@Setter
@EqualsAndHashCode(of = {"id"})
@Accessors(fluent = true, chain = true)
public class Product {

    private String id;
    private String title;
    private String coverPhoto;
    private BigDecimal price;
    private long qtyInventory;

    public static Product create() { return new Product(); }
}
