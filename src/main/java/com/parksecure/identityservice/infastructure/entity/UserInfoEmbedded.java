package com.parksecure.identityservice.infastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class UserInfoEmbedded {

    @Column(name = "firstname", unique = false, nullable = false, length = 20)
    private String firstname;

    @Column(name = "lastname", unique = false, nullable = false, length = 20)
    private String lastname;

    @Column(name = "phone",unique = true, nullable = false)
    private String phone;

    @Column(name = "address", unique = true, nullable = false)
    private String address;
}
