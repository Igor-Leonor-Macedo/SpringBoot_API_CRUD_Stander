package com.API.cad.user.Exception;

public class NotFoundUser extends RuntimeException {
    public NotFoundUser(String message) {
        super(message);
    }
}
