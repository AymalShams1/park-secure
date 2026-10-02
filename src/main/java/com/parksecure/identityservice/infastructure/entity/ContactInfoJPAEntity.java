package com.parksecure.identityservice.infastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ContactInfoJPAEntity {

    @Column(name = "phone",unique = true, nullable = false)
    private String phone;

    @Column(name = "address", unique = true, nullable = false)
    private String address;

}
