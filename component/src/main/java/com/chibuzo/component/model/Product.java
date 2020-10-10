package com.chibuzo.component.model;

import java.util.Arrays;

public class Product {
    private int productId;
    private int productOwnerId;
    private String productCategory;
    private String productName;
    private int productQuantity;
    private String productPrice;
    private String productDate;
    private byte[] productImage;

    public int getProductOwnerId() {
        return productOwnerId;
    }

    public void setProductOwnerId(int productOwnerId) {
        this.productOwnerId = productOwnerId;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        this.productPrice = productPrice;
    }

    public String getProductDate() {
        return productDate;
    }

    public void setProductDate(String productDate) {
        this.productDate = productDate;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public byte[] getProductImage() {
        return productImage;
    }

    public void setProductImage(byte[] productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", productOwnerId=" + productOwnerId +
                ", productCategory='" + productCategory + '\'' +
                ", productName='" + productName + '\'' +
                ", productQuantity=" + productQuantity +
                ", productPrice='" + productPrice + '\'' +
                ", productDate='" + productDate + '\'' +
                ", productImage=" + Arrays.toString(productImage) +
                '}';
    }
}


