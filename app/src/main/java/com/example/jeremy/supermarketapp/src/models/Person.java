package com.example.jeremy.supermarketapp.src.models;

import android.support.annotation.NonNull;

import com.example.jeremy.supermarketapp.src.constant.GenderType;

public class Person {

    private String name;
    private String surname;
    private int age;
    private GenderType genderType;

    public Person(String name , String surname , int age , GenderType genderType) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.genderType = genderType;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public GenderType getGenderType() {
        return genderType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGenderType(GenderType genderType) {
        this.genderType = genderType;
    }

    @NonNull
    @Override
    public String toString() {
        return "Person : " + "\n" +
                name + "\n" +
                surname + "\n" +
                age + "\n" +
                genderType.toString();
    }
}
