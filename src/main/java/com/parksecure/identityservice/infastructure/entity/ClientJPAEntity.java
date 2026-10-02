package com.parksecure.identityservice.infastructure.entity;

import com.parksecure.identityservice.domain.enums.AccountStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "clients")
@PrimaryKeyJoinColumn(name = "user_id")
public class ClientJPAEntity extends UserJPAEntity {

    @Column(name = "account_status")
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;
}
