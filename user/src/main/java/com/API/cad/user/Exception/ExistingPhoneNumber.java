package com.API.cad.user.Exception;

public class ExistingPhoneNumber extends RuntimeException {
    public ExistingPhoneNumber(String message) {
        super(message);
    }
}
