package com.example.HajratBackend.Module;

import java.util.UUID;



public class User {

    public enum UserType {
        ADMIN,
        WORKER
    }

    UUID id;
    String name;
    UserType userType;
    String phoneNumber;

    public User(UUID id, String name, UserType userType, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.userType = userType;
        this.phoneNumber = phoneNumber;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
