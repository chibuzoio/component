package com.chibuzo.component.model;

import com.chibuzo.component.layoutcomponent.VerticalLinearLayout;

public class ProductCategoryMenu {
    private String productCategory;
    private int productCategoryMenuIcon;
    private VerticalLinearLayout productCategoryMenuLayout;

    public ProductCategoryMenu(String productCategory, int productCategoryMenuIcon,
                               VerticalLinearLayout productCategoryMenuLayout) {
        this.productCategory = productCategory;
        this.productCategoryMenuIcon = productCategoryMenuIcon;
        this.productCategoryMenuLayout = productCategoryMenuLayout;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public int getProductCategoryMenuIcon() {
        return productCategoryMenuIcon;
    }

    public void setProductCategoryMenuIcon(int productCategoryMenuIcon) {
        this.productCategoryMenuIcon = productCategoryMenuIcon;
    }

    public VerticalLinearLayout getProductCategoryMenuLayout() {
        return productCategoryMenuLayout;
    }

    public void setProductCategoryMenuLayout(VerticalLinearLayout productCategoryMenuLayout) {
        this.productCategoryMenuLayout = productCategoryMenuLayout;
    }

    @Override
    public String toString() {
        return "ProductCategoryMenu{" +
                "productCategory='" + productCategory + '\'' +
                ", productCategoryMenuIcon=" + productCategoryMenuIcon +
                ", productCategoryMenuLayout=" + productCategoryMenuLayout +
                '}';
    }
}


