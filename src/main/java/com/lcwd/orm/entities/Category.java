package com.lcwd.orm.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jpa_category")
public class Category {
    @Id
    private String cId;
    private String title;
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    private List<Product> products = new ArrayList<>();
    public Category() {
    }
    public Category(String cId, String title,List<Product> products) {
        this.cId = cId;
        this.title = title;
        this.products=products;
    }
    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }



    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


}
