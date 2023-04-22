package com.truemart.truemartspring.Entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "shops")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class shopEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "shop_name", nullable = false, unique = true)
    private String shopName;
    @Column(name = "shop_address", nullable = false)
    private String shopAddress;
    @Column(name = "shop_phone", nullable = false)
    private String shopPhone;
    @Column(name = "shop_img", nullable = false)
    private String shopImage;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private userEntity user;

    @OneToMany(mappedBy = "shop")
    private List<productEntity> products = new ArrayList<>();

    public shopEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    public String getShopImage() {
        return shopImage;
    }

    public void setShopImage(String shopImage) {
        this.shopImage = shopImage;
    }

    public Long getUser() {
        return user.getId();
    }

    public void setUser(userEntity user) {
        this.user = user;
    }

    public List<productEntity> getProducts() {
        return products;
    }

    public void setProducts(List<productEntity> products) {
        this.products = products;
    }
}
