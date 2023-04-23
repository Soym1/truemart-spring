package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

import java.util.Date;
@Entity
@Table(name = "review")
public class reviewEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private userEntity user;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private productEntity product;

    @Column(name = "content", nullable = false)
    private String content;
    @Column(name = "rating", nullable = false)
    private Integer rating;

    @Column(name="post_date", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date postDate;

    public Long getId() {
        return id;
    }

    public userEntity getUser() {
        return user;
    }

    public void setUser(userEntity user) {
        this.user = user;
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
}
