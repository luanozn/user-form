package com.ifgoiano.myapplication.entities;

public class User {

    private final String profilePicture;
    private final String name;
    private final Phone phone;
    private final Address address;
    private final AccessData accessData;

    public User(String profilePicture, String name, Phone phone, Address address, AccessData accessData) {
        this.profilePicture = profilePicture;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.accessData = accessData;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public String getName() {
        return name;
    }

    public Phone getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public AccessData getAccessData() {
        return accessData;
    }
}
