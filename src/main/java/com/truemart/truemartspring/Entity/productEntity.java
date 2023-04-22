package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "products")
public class productEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name", nullable = false)
    private String name;
    @Column(name = "description", nullable = false)
    private String description;
    @Column(name = "begin_price", nullable = false)
    private Double beginPrice;
    @Column(name = "discount_price")
    private Double discountPrice;
    @Column(name = "quantity")
    private Long quantity;
    @Column(name = "date")
    private Date productDateCreation;

    @OneToMany(mappedBy = "product")
    private List<imageProductEntity> images = new ArrayList<>();

    @OneToMany(mappedBy = "product")
    private List<productDetailEntity> productDetails = new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "shop_id", nullable = false)
    private shopEntity shop;

    @ManyToOne
    @JoinColumn(name = "category_id", nullable = false)
    private categoryEntity category;

    public productEntity() {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getBeginPrice() {
        return beginPrice;
    }

    public void setBeginPrice(Double beginPrice) {
        this.beginPrice = beginPrice;
    }

    public Double getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Double discountPrice) {
        this.discountPrice = discountPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Date getProductDateCreation() {
        return productDateCreation;
    }

    public void setProductDateCreation(Date productDateCreation) {
        this.productDateCreation = productDateCreation;
    }

    public void setImages(List<imageProductEntity> images) {
        this.images = images;
    }

    public List<imageProductEntity> getImages() {
        return images;
    }

    public List<productDetailEntity> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<productDetailEntity> productDetails) {
        this.productDetails = productDetails;
    }

    public Long getShopID() {
        return shop.getId();
    }

    public void setShopID(shopEntity shop) {
        this.shop = shop;
    }

    public categoryEntity getCategory() {
        return category;
    }

    public void setCategory(categoryEntity category) {
        this.category = category;
    }


    @Override
    public String toString() {
        return "productEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", beginPrice=" + beginPrice +
                ", discountPrice=" + discountPrice +
                ", quantity=" + quantity +
                ", productDateCreation=" + productDateCreation +
                ", images=" + images +
                ", productDetails=" + productDetails +
                ", shop=" + shop +
                '}';
    }
}
