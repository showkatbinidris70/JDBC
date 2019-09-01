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

    private int id;
    private String productName;
    private int quantity;
    private int unitPrice;
    private double totalPrice;
    private double availabe;
    private double soldQty;

    public Summary() {
    }

    public Summary(int id, String productName, int quantity, int unitPrice, double totalPrice, double availabe, double soldQty) {
        this.id = id;
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.availabe = availabe;
        this.soldQty = soldQty;
    }

    public Summary(String productName, int quantity, int unitPrice, double totalPrice, double availabe, double soldQty) {
        this.productName = productName;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.availabe = availabe;
        this.soldQty = soldQty;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public double getAvailabe() {
        return availabe;
    }

    public void setAvailabe(double availabe) {
        this.availabe = availabe;
    }

    public double getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(double soldQty) {
        this.soldQty = soldQty;
    }


}
