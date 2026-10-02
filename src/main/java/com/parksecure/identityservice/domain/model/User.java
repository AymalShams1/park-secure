package com.parksecure.identityservice.domain.model;

import java.util.UUID;

public abstract class User {
    private UUID id;
    private String email;
    private ContactInfo contactInfo;

    public User() {
    }

    public User(UUID id, String email, ContactInfo contactInfo) {
        this.id = id;
        this.email = email;
        this.contactInfo = contactInfo;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ContactInfo getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(ContactInfo contactInfo) {
        this.contactInfo = contactInfo;
    }
}
