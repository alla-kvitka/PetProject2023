package com.example.demo.model;

import lombok.Data;

import java.util.UUID;
@Data
public class User {
    private final UUID uuid;
    private final String username;

}
