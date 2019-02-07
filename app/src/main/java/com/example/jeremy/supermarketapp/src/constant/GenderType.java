package com.example.jeremy.supermarketapp.src.constant;

import android.support.annotation.NonNull;

public enum GenderType {
    MALE,
    FEMALE;

    @NonNull
    @Override
    public String toString() {
        String gender = null;
        switch (this) {
            case MALE:
                gender = "Male";
                break;
            case FEMALE:
                gender = "Female";
                break;
        }
        return gender;
    }
}
