package com.example.jeremy.supermarketapp.src.models;

import android.support.annotation.NonNull;

import java.util.ArrayList;
import java.util.List;

public class PurchaseContainer {

    private List<Purchase> purchases;

    public PurchaseContainer() {
        purchases = new ArrayList<>();
    }

    public int getCount() {
        return purchases.size();
    }

    public void add(Purchase purchase) {
        purchases.add(purchase);
    }

    public Purchase getPurchase(int position) {
        return purchases.get(position);
    }

    @NonNull
    @Override
    public String toString() {
        StringBuilder resBuilder = new StringBuilder();
        if (getCount() != 0) for (int i = 0 ; i < purchases.size() ; i++) resBuilder.append(purchases.get(i));
        else resBuilder.append("No purchases!");
        return resBuilder.toString();
    }
}
