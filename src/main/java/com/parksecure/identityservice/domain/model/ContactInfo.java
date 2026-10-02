package com.parksecure.identityservice.domain.model;

public class ContactInfo {

    private String firstname;

    private String lastname;

    private String phone;

    private String address;

    public ContactInfo() {}

    public ContactInfo(String phone, String address) {
        this.phone = phone;
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
