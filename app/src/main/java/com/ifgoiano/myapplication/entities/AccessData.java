package com.ifgoiano.myapplication.entities;

public class AccessData {

    private final String email;
    private final String password;

    public AccessData(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
