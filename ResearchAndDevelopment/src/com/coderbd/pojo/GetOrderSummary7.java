/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

import java.util.Date;



/**
 *
 * @author User
 */
public class GetOrderSummary7 {
    private int id;
    private String orderCode;
    private int productName;
    private double unitPrice;
    private double totalPrice;
    private Date deliveryDate;

    public GetOrderSummary7() {
    }

    public GetOrderSummary7(int id, String orderCode, int productName, double unitPrice, double totalPrice, Date deliveryDate) {
        this.id = id;
        this.orderCode = orderCode;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.deliveryDate = deliveryDate;
    }

    public GetOrderSummary7(String orderCode, int productName, double unitPrice, double totalPrice, Date deliveryDate) {
        this.orderCode = orderCode;
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderCode() {
        return orderCode;
    }

    public void setOrderCode(String orderCode) {
        this.orderCode = orderCode;
    }

    public int getProductName() {
        return productName;
    }

    public void setProductName(int productName) {
        this.productName = productName;
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

    public Date getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(Date deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    
    
}
