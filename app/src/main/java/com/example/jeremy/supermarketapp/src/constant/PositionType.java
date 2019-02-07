package com.example.jeremy.supermarketapp.src.constant;

import android.support.annotation.NonNull;

public enum PositionType {
    CONSULTANT,
    MIDDLE,
    HIGH_QUALIFIED;

    @NonNull
    @Override
    public String toString() {
        String position = null;
        switch (this) {
            case CONSULTANT:
                position = "Consultant";
                break;
            case MIDDLE:
                position = "Middle";
                break;
            case HIGH_QUALIFIED:
                position = "High-qualified";
                break;
        }
        return position;
    }
}
