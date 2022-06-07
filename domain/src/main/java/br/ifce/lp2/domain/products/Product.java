package br.ifce.lp2.domain.products;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.math.BigDecimal;

public class Product {

    private String id;
    private String name;
    private String coverPhoto;
    private BigDecimal price;
    private long qtyInventory;

    private Product(String id, String name, String coverPhoto, BigDecimal price, long qtyInventory) {
        this.id = id;
        this.name = name;
        this.coverPhoto = coverPhoto;
        this.price = price;
        this.qtyInventory = qtyInventory;
    }

    public static Product create(String name, String coverPhoto, BigDecimal price, long qtyInventory) {

        final var aProduct = new Product(
                null,
                name,
                coverPhoto,
                price,
                qtyInventory
        );

        aProduct.validate();

        return aProduct;
    }

    public Product update(String name, String coverPhoto, BigDecimal price, long qtyInventory) {
        this.name = name;
        this.coverPhoto = coverPhoto;
        this.price = price;
        this.qtyInventory = qtyInventory;

        this.validate();

        return this;
    }

    public Product price(BigDecimal price) {
        this.price = price;
        this.validate();
        return this;
    }

    public Product qtyInventory(long qtyInventory) {
        this.qtyInventory = qtyInventory;
        this.validate();
        return this;
    }

    public Product coverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
        this.validate();
        return this;
    }

    private void validate() {

        if (this.name == null || this.name.isEmpty()) {
            throw new IllegalArgumentException("Name is required");
        }

        if (price == null) {
            throw new IllegalArgumentException("'price' cannot be null");
        }

        if (price.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("'price' cannot be negative");
        }

        if (qtyInventory < 0) {
            throw new IllegalArgumentException("'qty inventory' cannot be negative");
        }

    }

    public String id() {
        return id;
    }

    public String name() {
        return name;
    }

    public String coverPhoto() {
        return coverPhoto;
    }

    public BigDecimal price() {
        return price;
    }

    public long qtyInventory() {
        return qtyInventory;
    }

}

