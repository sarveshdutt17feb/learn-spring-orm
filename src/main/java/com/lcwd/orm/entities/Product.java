package com.lcwd.orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="jpa_product")
public class Product {
    @Id
    private String pId;
    private String productName;
    @ManyToMany(mappedBy = "products",fetch = FetchType.EAGER)
    private List<Category> categories = new ArrayList<>();


    public Product() {
    }
    public Product(String pId, String productName,List<Category> categories) {
        this.pId = pId;
        this.productName = productName;
        this.categories=categories;

    }



    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }


}
