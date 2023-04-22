package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "invoice_items")
public class invoiceItemEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "quantity", nullable = false)
    private Long quantity;

    @ManyToOne
    @JoinColumn(name = "product_id", nullable = false)
    private productEntity productID;

    @ManyToOne
    @JoinColumn(name= "invoice_code", referencedColumnName = "invoice_code", nullable = false)
    private invoiceEntity invoiceCode;

    public invoiceItemEntity() {
    }

    public Long getId() {
        return id;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public productEntity getProductID() {
        return productID;
    }

    public void setProductID(productEntity productID) {
        this.productID = productID;
    }

    public invoiceEntity getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(invoiceEntity invoiceCode) {
        this.invoiceCode = invoiceCode;
    }
}
