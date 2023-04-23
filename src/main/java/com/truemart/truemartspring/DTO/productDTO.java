package com.truemart.truemartspring.DTO;

import java.nio.DoubleBuffer;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
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
    private String productDiscountPrice;
    private String productDateCreation;
    private Long quantity;
    private List<imageDTO> images;
    private List<productDetailDTO> productDetails;
    private categoryDTO category;
    private List<reviewDTO> review;
    private Double ratingAvg;

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
        Locale locale = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currency = formatter.format(productBeginPrice).replace("₫","VNĐ");
        this.productBeginPrice = currency;
    }

    public String getProductDiscountPrice() {
        return productDiscountPrice;
    }

    public void setProductDiscountPrice(Double productDiscountPrice) {
        Locale locale = new Locale.Builder().setLanguage("vi").setRegion("VN").build();
        NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
        String currency = formatter.format(productDiscountPrice).replace("₫","VNĐ");
        this.productDiscountPrice = currency;
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

    public List<reviewDTO> getReview() {
        return review;
    }

    public void setReview(List<reviewDTO> review) {
        Double avg = 0D;
        Double sum = 0D;
        for (reviewDTO reviewDTO : review){
            sum += reviewDTO.getRating();
        }
        avg = review.size() == 0 ? 3.5 : sum / review.size();
        double roundedA = Math.round(avg * 100.0) / 100.0;
        setRatingAvg(roundedA);
        this.review = review;
    }

    public Double getRatingAvg() {
        return ratingAvg;
    }

    public void setRatingAvg(Double ratingAvg) {
        this.ratingAvg = ratingAvg;
    }

    @Override
    public String toString() {
        String reviewString = "";
        for(reviewDTO re : review){
            reviewString += re.toString();
        }
        return "productDTO{" +
                "productID=" + productID +
                ", productName='" + productName + '\'' +
                ", shopID=" + shopID +
                ", categoryID=" + categoryID +
                ", productDescription='" + productDescription + '\'' +
                ", productBeginPrice='" + productBeginPrice + '\'' +
                ", productDiscountPrice='" + productDiscountPrice + '\'' +
                ", productDateCreation='" + productDateCreation + '\'' +
                ", quantity=" + quantity +
                ", images=" + images +
                ", productDetails=" + productDetails +
                ", category=" + category +
                ", review=" + reviewString +
                '}';
    }
}
