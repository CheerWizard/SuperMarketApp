package com.example.jeremy.supermarketapp.src.models;

import android.support.annotation.NonNull;

import com.example.jeremy.supermarketapp.src.constant.PositionType;

public class Seller {

    private Person person;
    private PositionType positionType;

    public Seller(Person person, PositionType positionType) {
        this.person = person;
        this.positionType = positionType;
    }

    public Person getPerson() {
        return person;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    @NonNull
    @Override
    public String toString() {
        return "Seller : " + "\n" +
                person.toString() + "\n" +
                positionType.toString() + "\n";
    }
}
