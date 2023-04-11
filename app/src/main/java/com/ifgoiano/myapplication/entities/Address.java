package com.ifgoiano.myapplication.entities;

public class Address {

    private final String street;
    private final String number;
    private final String cep;
    private final String complement;
    private final String city;
    private final State state;

    public Address(String street, String number, String cep, String complement, String city, State state) {
        this.street = street;
        this.number = number;
        this.cep = cep;
        this.complement = complement;
        this.city = city;
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getCep() {
        return cep;
    }

    public String getComplement() {
        return complement;
    }

    public String getCity() {
        return city;
    }

    public State getState() {
        return state;
    }
}
