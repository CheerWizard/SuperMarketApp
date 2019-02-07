package com.example.jeremy.supermarketapp.src.models;

import android.support.annotation.NonNull;

import com.example.jeremy.supermarketapp.src.constant.PurchaseType;

public class Purchase {

    private User user;
    private int cost;
    private PurchaseType purchaseType;

    public Purchase(User user, int cost, PurchaseType purchaseType) {
        this.user = user;
        this.cost = cost;
        this.purchaseType = purchaseType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public PurchaseType getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(PurchaseType purchaseType) {
        this.purchaseType = purchaseType;
    }

    private int commission() {
        return cost*5/100;
    }

    @NonNull
    @Override
    public String toString() {
        return "Purchase : " + "\n" +
                user.toString() + "\n" +
                purchaseType.toString() + "\n" +
                cost + "\n" +
                "Commission : " + "\n" +
                commission() + "\n";
    }
}
