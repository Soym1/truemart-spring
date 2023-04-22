package com.truemart.truemartspring.DTO;

import java.text.NumberFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class productDTO {
    private Long productID;
    private String productName;
    private Long shopID;
    private Integer categoryID;
    private String productDescription;
    private String  productBeginPrice;
    private Double productDiscountPrice;
    private String productDateCreation;
    private Long quantity;
    private List<imageDTO> images;
    private List<productDetailDTO> productDetails;
    private categoryDTO category;
    public productDTO() {
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Long getShopID() {
        return shopID;
    }

    public void setShopID(Long shop) {
        this.shopID = shop;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductBeginPrice() {
        return productBeginPrice;
    }

    public void setProductBeginPrice(Double productBeginPrice) {
        Locale locale = new Locale("vi", "VN");
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currency = formatter.format(productBeginPrice).replace("₫","");
        this.productBeginPrice = currency;
    }

    public Double getProductDiscountPrice() {
        return productDiscountPrice;
    }

    public void setProductDiscountPrice(Double productDiscountPrice) {
        this.productDiscountPrice = productDiscountPrice;
    }

    public String getProductDateCreation() {
        return productDateCreation;
    }

    public void setProductDateCreation(String productDateCreation) {
        this.productDateCreation = productDateCreation;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }


    public Integer getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(Integer categoryID) {
        this.categoryID = categoryID;
    }

    public List<imageDTO> getImages() {
        return images;
    }

    public void setImages(List<imageDTO> images) {
        this.images = images;
    }

    public List<productDetailDTO> getProductDetails() {
        return productDetails;
    }

    public void setProductDetails(List<productDetailDTO> productDetails) {
        this.productDetails = productDetails;
    }

    public categoryDTO getCategory() {
        return category;
    }

    public void setCategory(categoryDTO category) {
        this.category = category;
    }
}
