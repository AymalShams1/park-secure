package com.parksecure.identityservice.domain.model;

import com.parksecure.identityservice.domain.enums.AccountStatus;
import com.parksecure.identityservice.domain.enums.Role;
import java.util.Set;

public class Employee {
    private Long employeeNumber;

    public Set<Role> Roles;

    private AccountStatus accountStatus;
}
