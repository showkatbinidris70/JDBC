/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.codderbd.pojo;

/**
 *
 * @author User
 */
public class ProductCategory {
    private int id;
    private String catName;

    public ProductCategory() {
    }

    public ProductCategory(int id) {
        this.id = id;
    }

    public ProductCategory(String catName) {
        this.catName = catName;
    }

    public ProductCategory(int id, String catName) {
        this.id = id;
        this.catName = catName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCatName() {
        return catName;
    }

    public void setCatName(String catName) {
        this.catName = catName;
    }
    
    
    
}
