package com.API.cad.user.DTO.Response;

public class UserResponse {
    private Long id;
    private String name;
    private String phoneNumber;

    public UserResponse(Long id, String name, String phoneNumber) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
