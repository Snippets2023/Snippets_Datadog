package com.example.DataDog.Models;

import java.util.UUID;

public class User{

    private final UUID id;
    private final String name;
    private final String bio;

    public User(UUID id, String name, String bio) {
        this.id = id;
        this.name = name;
        this.bio = bio;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBio() {
        return bio;
    }
}
