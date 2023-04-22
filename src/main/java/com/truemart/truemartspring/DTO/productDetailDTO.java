package com.truemart.truemartspring.DTO;

public class productDetailDTO {
    private Long productID;
    private String tag;
    private String context;

    public Long getProductID() {
        return productID;
    }

    public void setProductID(Long productID) {
        this.productID = productID;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    @Override
    public String toString() {
        return "productDetailDTO{" +
                "productID=" + productID +
                ", tag='" + tag + '\'' +
                ", context='" + context + '\'' +
                '}';
    }
}
