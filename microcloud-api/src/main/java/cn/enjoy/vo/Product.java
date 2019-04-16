package cn.enjoy.vo;

import java.io.Serializable;

public class Product implements Serializable {
    private Long productId;
    private String ProductName;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getProductDesc() {
        return productDesc;
    }

    public void setProductDesc(String productDesc) {
        this.productDesc = productDesc;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", getProductName='" + ProductName + '\'' +
                ", productDesc='" + productDesc + '\'' +
                '}';
    }


    private String productDesc;
}
