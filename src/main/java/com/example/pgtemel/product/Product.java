package com.example.pgtemel.product;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="products")
public class Product {

    @Id
    private long id;


    public Product() {
    
    }

    private String name;
    
    public Product(long id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}