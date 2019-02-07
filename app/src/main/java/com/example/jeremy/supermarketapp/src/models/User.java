package com.example.jeremy.supermarketapp.src.models;

import android.support.annotation.NonNull;

public class User {

    private Person person;
    private String password;
    private String email;

    public User(Person person, String password, String email) {
        this.person = person;
        this.password = password;
        this.email = email;
    }

    public Person getPerson() {
        return person;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NonNull
    @Override
    public String toString() {
        return "User : " + "\n" +
                person.toString() + "\n" +
                email + "\n" +
                password + "\n";
    }
}
