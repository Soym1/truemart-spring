package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

@Entity
@Table(name = "invoice_status")
public class invoiceStatusEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "type", nullable = false)
    private String type;

    public invoiceStatusEntity() {
    }

    public int getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
