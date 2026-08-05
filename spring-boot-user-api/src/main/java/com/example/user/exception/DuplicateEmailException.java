package com.example.user.exception;

public class DuplicateEmailException extends RuntimeException {
    public DuplicateEmailException(String message) {
        super(message);
    }

    public DuplicateEmailException(String message, Throwable cause) {
        super(message, cause);
    }

    public static DuplicateEmailException emailAlreadyExists(String email) {
        return new DuplicateEmailException("Email already exists: " + email);
    }
}
