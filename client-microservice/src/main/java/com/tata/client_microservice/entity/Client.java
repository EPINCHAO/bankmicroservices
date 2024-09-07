package com.tata.client_microservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = true)
public class Client extends  Person{
    @Column(nullable = false, unique = true)
    private String clientId;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private Boolean status;

    // Audit fields
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
