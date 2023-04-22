package com.truemart.truemartspring.Entity;

import jakarta.persistence.*;
import org.hibernate.annotations.NaturalId;

import java.util.Date;

@Entity
@Table(name = "invoices")
public class invoiceEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NaturalId
    @Column(name = "invoice_code", nullable = false)
    private String invoiceCode;

    @Column(name = "date_creation", nullable = false)
    private Date dateCreation;

    @Column(name = "buyer_address", nullable = false)
    private String buyerAddress;

    @Column(name = "total_sum", nullable = false)
    private Double totalSum;
    @Column(name = "invoice_detail", nullable = false)
    private String invoiceDetail;

    @ManyToOne
    @JoinColumn(name = "status", nullable = false)
    private invoiceStatusEntity status;

    @ManyToOne
    @JoinColumn(name="buyer_id", nullable = false)
    private userEntity userID;

    public invoiceEntity() {
    }

    public Long getId() {
        return id;
    }

    public String getInvoiceCode() {
        return invoiceCode;
    }

    public void setInvoiceCode(String invoiceCode) {
        this.invoiceCode = invoiceCode;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public Double getTotalSum() {
        return totalSum;
    }

    public void setTotalSum(Double totalSum) {
        this.totalSum = totalSum;
    }

    public String getInvoiceDetail() {
        return invoiceDetail;
    }

    public void setInvoiceDetail(String invoiceDetail) {
        this.invoiceDetail = invoiceDetail;
    }

    public invoiceStatusEntity getStatus() {
        return status;
    }

    public void setStatus(invoiceStatusEntity status) {
        this.status = status;
    }

    public userEntity getUserID() {
        return userID;
    }

    public void setUserID(userEntity userID) {
        this.userID = userID;
    }
}
