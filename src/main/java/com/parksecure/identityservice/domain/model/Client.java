package com.parksecure.identityservice.domain.model;

public class Client extends User {
    private String accountStatus;

    public Client() {}

    public Client(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }
}
