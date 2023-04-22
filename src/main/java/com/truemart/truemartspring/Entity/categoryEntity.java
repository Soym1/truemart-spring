package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class categoryEntity {
    @Id
    private Long id;
    @Column(name = "category")
    private String category;

    public categoryEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "categoryEntity{" +
                "id=" + id +
                ", category='" + category + '\'' +
                '}';
    }
}
