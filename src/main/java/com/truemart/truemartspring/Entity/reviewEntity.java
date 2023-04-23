package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "review")
public class reviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(targetEntity = userEntity.class)
    @JoinColumn(name = "user_id")
    private userEntity user;

    @ManyToOne(targetEntity = productEntity.class, fetch = FetchType.LAZY)
    @JoinColumn(name = "product_id", insertable = false, updatable = false)
    private productEntity product;

    @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name="post_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date postDate;
    @Column(name="product_id", nullable = false)
    private Long productID;

    private String username;
    private String name;
    private String email;
    public reviewEntity() {
    }

    public Long getId() {
        return id;
    }

    public userEntity getUser() {
        return user;
    }

    public void setUser(userEntity user) {
        this.user = user;
    }

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }

    public Date getPostDate() {
        return postDate;
    }

    public void setPostDate(Date postDate) {
        this.postDate = postDate;
    }

    public String getUsername() {
        return user.getUsername();
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return user.getName();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return user.getEmail();
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "reviewEntity{" +
                "id=" + id +
                ", user=" + user +
                ", product=" + product +
                ", content='" + content + '\'' +
                ", rating=" + rating +
                ", postDate=" + postDate +
                ", productID=" + productID +
                '}';
    }
}
