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
    private String productCode;
    private double availableQty;
    private double soldQty;
    private double unitPrice;
    private double totalPrice;

    public Sales() {
    }

    public Sales(int id, String productName, String productCode, double availableQty, double soldQty, double unitPrice, double totalPrice) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.availableQty = availableQty;
        this.soldQty = soldQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Sales(String productName, String productCode, double availableQty, double soldQty, double unitPrice, double totalPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.availableQty = availableQty;
        this.soldQty = soldQty;
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

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public double getAvailableQty() {
        return availableQty;
    }

    public void setAvailableQty(double availableQty) {
        this.availableQty = availableQty;
    }

    public double getSoldQty() {
        return soldQty;
    }

    public void setSoldQty(double soldQty) {
        this.soldQty = soldQty;
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
