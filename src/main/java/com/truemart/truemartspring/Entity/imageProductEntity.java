package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "image_products")
public class imageProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "type", nullable = false)
    private String type;
    @Column(name="context", nullable = false)
    private String context;
    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private productEntity product;

    public imageProductEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Long getProduct() {
        return product.getId();
    }

    public void setProduct(productEntity product) {
        this.product = product;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}
