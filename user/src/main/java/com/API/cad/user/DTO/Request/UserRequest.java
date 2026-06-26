package com.API.cad.user.DTO.Request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class UserRequest {
    private Long id;

    @NotBlank(message = "The name is mandatory")
    @Pattern(regexp = "^[^0-9]*$", message = "The name must not contain numbers")
    private String name;

    @NotBlank(message = "The Phone Number is mandatory")
    @Pattern(regexp = "^[0-9+()\\-\\s]*$", message = "The phone number must not contain letters")
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
