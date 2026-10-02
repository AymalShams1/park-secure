package com.parksecure.identityservice.infastructure.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.UUID;

import java.time.Instant;

@Entity
@Table(name = "Users")
@Getter
@Setter
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class UserJPAEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "user_id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password_hash", nullable = false, unique = true)
    private String password;

    @Column(name = "created_at", nullable = false)
    private Instant createdAt;

    @Embedded
    private ContactInfoJPAEntity contactInfo;


}
