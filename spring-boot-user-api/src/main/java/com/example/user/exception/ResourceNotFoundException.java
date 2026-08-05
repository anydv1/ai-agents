package com.example.user.exception;

public class ResourceNotFoundException extends RuntimeException {
    public ResourceNotFoundException(String message) {
        super(message);
    }

    public ResourceNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public static ResourceNotFoundException userNotFound(Long id) {
        return new ResourceNotFoundException("User not found with id: " + id);
    }

    public static ResourceNotFoundException userNotFoundByEmail(String email) {
        return new ResourceNotFoundException("User not found with email: " + email);
    }
}
