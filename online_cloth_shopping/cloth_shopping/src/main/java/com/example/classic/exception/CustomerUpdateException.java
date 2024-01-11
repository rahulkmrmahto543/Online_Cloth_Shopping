package com.example.classic.exception;

public class CustomerUpdateException extends RuntimeException {

    public CustomerUpdateException(String message) {
        super(message);
    }

    public CustomerUpdateException(String message, Throwable cause) {
        super(message, cause);
    }
}
