package com.example.jeremy.supermarketapp.src.models;

import android.support.annotation.NonNull;

public class Market {

    private String marketName;
    private Seller seller;
    private PurchaseContainer purchaseContainer;

    public Market(String marketName, Seller seller, PurchaseContainer purchaseContainer) {
        this.marketName = marketName;
        this.seller = seller;
        this.purchaseContainer = purchaseContainer;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public Seller getSeller() {
        return seller;
    }

    public void setSeller(Seller seller) {
        this.seller = seller;
    }

    public Purchase getPurchase(int position) {
        return purchaseContainer.getPurchase(position);
    }

    public void setPurchase(Purchase purchase) {
        purchaseContainer.add(purchase);
    }

    @NonNull
    @Override
    public String toString() {
        return "Market : " + "\n" +
                marketName + "\n" +
                seller.toString() + "\n" +
                purchaseContainer.toString() + "\n";
    }
}
