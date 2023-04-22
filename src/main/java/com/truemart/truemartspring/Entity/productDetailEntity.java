package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_details")
public class productDetailEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private productEntity product;

    @Column(name = "tag", nullable = false)
    private String tag;
    @Lob
    @Column(name = "context", columnDefinition = "TEXT")
    private String context;

    public productDetailEntity() {
    }

    public Long getId() {
        return id;
    }

    public productEntity getProduct() {
        return product;
    }

    public void setProduct(productEntity product) {
        this.product = product;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

}
