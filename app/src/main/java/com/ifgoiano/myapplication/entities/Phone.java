package com.ifgoiano.myapplication.entities;

public class Phone {

    private final String ddd;
    private final String phone;

    public Phone(String ddd, String phone) {
        this.ddd = ddd;
        this.phone = phone;
    }

    public String getDdd() {
        return ddd;
    }

    public String getPhone() {
        return phone;
    }
}
