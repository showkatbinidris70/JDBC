/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

/**
 * @author User
 */
public class Sales {

    private int id;
    private String productName;
    private int availableQty;
    private int salseQty;
    private double unitPrice;
    private double totalPrice;


    public Sales() {
    }

    public Sales(int id) {
        this.id = id;
    }

    public Sales(int id, String productName, int availableQty, int salseQty, double unitPrice, double totalPrice) {
        this.id = id;
        this.productName = productName;
        this.availableQty = availableQty;
        this.salseQty = salseQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Sales(String productName, int availableQty, int salseQty, double unitPrice, double totalPrice) {
        this.productName = productName;
        this.availableQty = availableQty;
        this.salseQty = salseQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(int availableQty) {
        this.availableQty = availableQty;
    }

    public int getSalseQty() {
        return salseQty;
    }

    public void setSalseQty(int salseQty) {
        this.salseQty = salseQty;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }


}
