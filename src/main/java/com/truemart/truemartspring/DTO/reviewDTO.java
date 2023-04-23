package com.truemart.truemartspring.DTO;

import java.util.Date;

public class reviewDTO {
    private Long id;
    private String userName;
    private String userEmail;
    private String userUsername;
    private productDTO product;
    private String content;
    private String postDate;
    private Integer rating;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public String getUserUsername() {
        return userUsername;
    }

    public void setUserUsername(String userUsername) {
        this.userUsername = userUsername;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public productDTO getProduct() {
        return product;
    }

    public void setProduct(productDTO product) {
        this.product = product;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPostDate() {
        return postDate;
    }

    public void setPostDate(String postDate) {
        this.postDate = postDate;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "reviewDTO{" +
                "id=" + id +
                ", product=" + product +
                ", content='" + content + '\'' +
                ", postDate=" + postDate +
                ", rating=" + rating +
                '}';
    }
}
