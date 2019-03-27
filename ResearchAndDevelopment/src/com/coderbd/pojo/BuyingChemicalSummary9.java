/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderbd.pojo;

/**
 *
 * @author User
 */
public class BuyingChemicalSummary9 {

    private int id;
    private String chemicalName;
    private int totalQty;
    private double unitPrice;
    private double totalPrice;
    private int totalUsed;
    private int avilableQty;

    public BuyingChemicalSummary9() {
    }

    public BuyingChemicalSummary9(int id, String chemicalName, int totalQty, double unitPrice, double totalPrice, int totalUsed, int avilableQty) {
        this.id = id;
        this.chemicalName = chemicalName;
        this.totalQty = totalQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.totalUsed = totalUsed;
        this.avilableQty = avilableQty;
    }

    public BuyingChemicalSummary9(String chemicalName, int totalQty, double unitPrice, double totalPrice, int totalUsed, int avilableQty) {
        this.chemicalName = chemicalName;
        this.totalQty = totalQty;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
        this.totalUsed = totalUsed;
        this.avilableQty = avilableQty;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getChemicalName() {
        return chemicalName;
    }

    public void setChemicalName(String chemicalName) {
        this.chemicalName = chemicalName;
    }

    public int getTotalQty() {
        return totalQty;
    }

    public void setTotalQty(int totalQty) {
        this.totalQty = totalQty;
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

    public int getTotalUsed() {
        return totalUsed;
    }

    public void setTotalUsed(int totalUsed) {
        this.totalUsed = totalUsed;
    }

    public int getAvilableQty() {
        return avilableQty;
    }

    public void setAvilableQty(int avilableQty) {
        this.avilableQty = avilableQty;
    }
    
}
