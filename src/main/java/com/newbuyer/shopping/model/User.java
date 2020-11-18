package com.newbuyer.shopping.model;

public class User {
    private final String name;
    private final String publicKey;
    private final Integer points;

    public User(String name, String publicKey,Integer points) {
        this.name = name;
        this.publicKey = publicKey;
        this.points=points;
    }

    public String getName() {
        return name;
    }

    public String getPublicKey() {
        return publicKey;
    }
}
