package com.example.rowitech_authserver.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.security.oauth2.server.authorization.client.RegisteredClient;

import java.security.Identity;

@Entity
@Data
public class User extends RegisteredClient {
    @Id
    private String id;
}
