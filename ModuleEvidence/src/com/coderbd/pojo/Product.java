package com.coderbd.pojo;

import java.sql.Date;

public class Product {

    private int id;
    private String productName;
    private String productCode;
    private int Qty;
    private double uniteprice;
    private double totalPrice;
    private int Stock;
    private Date purchaseDate;

    public Product() {
    }

    public Product(int id) {
        this.id = id;
    }

    public Product(String productName, String productCode, int Qty, double uniteprice, double totalPrice, int Stock, Date purchaseDate) {
        this.productName = productName;
        this.productCode = productCode;
        this.Qty = Qty;
        this.uniteprice = uniteprice;
        this.totalPrice = totalPrice;
        this.Stock = Stock;
        this.purchaseDate = purchaseDate;
    }

    public Product(int id, String productName, String productCode, int Qty, double uniteprice, double totalPrice, int Stock, Date purchaseDate) {
        this.id = id;
        this.productName = productName;
        this.productCode = productCode;
        this.Qty = Qty;
        this.uniteprice = uniteprice;
        this.totalPrice = totalPrice;
        this.Stock = Stock;
        this.purchaseDate = purchaseDate;
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

    public int getQty() {
        return Qty;
    }

    public void setQty(int Qty) {
        this.Qty = Qty;
    }

    public double getUniteprice() {
        return uniteprice;
    }

    public void setUniteprice(double uniteprice) {
        this.uniteprice = uniteprice;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public Date getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(Date purchaseDate) {
        this.purchaseDate = purchaseDate;
    }


}
