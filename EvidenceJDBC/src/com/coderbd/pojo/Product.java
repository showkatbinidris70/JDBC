/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

/**
 * @author User
 */
public class Product {
<<<<<<<HEAD
    private int id;
    private String productName;
    private String productCode;
    private int qty;
=======

    private int id;
    private String productName;
    private String productCode;
    private int quantity;
>>>>>>>1880a5098551963e5dfd3e13436e5e860a30f95b
    private double unitPrice;
    private double totalPrice;

    public Product() {
    }

<<<<<<<HEAD

    public Product(String productName, String productCode, int qty, double unitPrice, double totalPrice) {
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

    public Product(int id, String productName, String productCode, int qty, double unitPrice, double totalPrice) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.qty = qty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }

=======
        >>>>>>>1880a5098551963e5dfd3e13436e5e860a30f95b

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

<<<<<<<HEAD

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
=======
        public int getQuantity () {
            return quantity;
        }

        public void setQuantity ( int quantity){
            this.quantity = quantity;
>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
        }

        public double getUnitPrice () {
            return unitPrice;
        }

        public void setUnitPrice ( double unitPrice){
            this.unitPrice = unitPrice;
        }

        public double getTotalPrice () {
            return totalPrice;
        }

        public void setTotalPrice ( double totalPrice){
            this.totalPrice = totalPrice;
        }
<<<<<<<HEAD

                =======

    public Product(String productName, String productCode, int quantity, double unitPrice, double totalPrice){
            this.productName = productName;
            this.productCode = productCode;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.totalPrice = totalPrice;
        }

    public Product( int id, String productName, String productCode,int quantity, double unitPrice, double totalPrice){
            this.id = id;
            this.productName = productName;
            this.productCode = productCode;
            this.quantity = quantity;
            this.unitPrice = unitPrice;
            this.totalPrice = totalPrice;
        }

>>>>>>>1880 a5098551963e5dfd3e13436e5e860a30f95b
    }
