package com.example.HajratBackend.Module.Request;

public class AddUserRequest {

    private String name;
    private String phoneNo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public AddUserRequest(String name, String phoneNo) {
        this.name = name;
        this.phoneNo = phoneNo;
    }
}
