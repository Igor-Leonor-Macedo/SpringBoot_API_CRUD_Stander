package com.API.cad.user.DTO.Request;

import jakarta.validation.constraints.NotBlank;

public class UserRequest {
    private Long id;

    @NotBlank(message = "The name is mandatory")
    private String name;

    @NotBlank(message = "The Phone Number is mandatory")
    private String phoneNumber;

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
