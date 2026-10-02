package com.parksecure.identityservice.infastructure.entity;

import com.parksecure.identityservice.domain.enums.AccountStatus;
import com.parksecure.identityservice.domain.enums.Role;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@Table(name = "employees")
@PrimaryKeyJoinColumn(name = "user_id")
public class EmployeeJPAEntity extends UserJPAEntity {

    @Column(unique = true, nullable = false)
    private Long employeeNumber;

    @Enumerated(EnumType.STRING)
    public Set<Role> Roles;

    @Column(name = "account_status")
    @Enumerated(EnumType.STRING)
    private AccountStatus accountStatus;

}
