package com.example.jeremy.supermarketapp.src.constant;

import android.support.annotation.NonNull;

public enum PurchaseType {
    FOOD,
    FURNITURE,
    JEWELERY,
    WEAPONS,
    PHONES,
    TV,
    PC;

    @NonNull
    @Override
    public String toString() {
        String purchase = null;
        switch (this) {
            case PC:
                purchase = "PC";
                break;
            case TV:
                purchase = "TV";
                break;
            case JEWELERY:
                purchase = "Jewelery";
                break;
            case FOOD:
                purchase = "Food";
                break;
            case FURNITURE:
                purchase = "Furniture";
                break;
            case WEAPONS:
                purchase = "Weapon";
                break;
            case PHONES:
                purchase = "Phone";
                break;
        }
        return purchase;
    }
}
