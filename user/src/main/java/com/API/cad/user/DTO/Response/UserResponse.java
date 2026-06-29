package com.API.cad.user.DTO.Response;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserResponse {
    @NotBlank(message = "The ID is mandatory")
    @Pattern(regexp = "^[^0-9]*$", message = "The name must not contain numbers")
    private Long id;
    private String name;
    private String phoneNumber;

    public UserResponse(Long id, String name, String phoneNumber) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
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
