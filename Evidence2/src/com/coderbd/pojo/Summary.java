/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

/**
 * @author User
 */
public class Summary {
    private String productName;
    private int quantity;
    private double totalQty;
    private double soldQty;
    private double availableQty;
    private Product product;

    public Summary() {
    }

    public Summary(String productName, int quantity, double totalQty, double soldQty, double availableQty, Product product) {
        this.productName = productName;
        this.quantity = quantity;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
        this.product = product;
    }

    public Summary(String productName, int quantity, double totalQty, double soldQty, double availableQty) {
        this.productName = productName;
        this.quantity = quantity;
        this.totalQty = totalQty;
        this.soldQty = soldQty;
        this.availableQty = availableQty;
    }

//    public Summary(String trim, int parseInt, double parseDouble, double parseDouble0, Product product1) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(double totalQty) {
        this.totalQty = totalQty;
    }

    public double getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(double soldQty) {
        this.soldQty = soldQty;
    }

    public double getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(double availableQty) {
        this.availableQty = availableQty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}
