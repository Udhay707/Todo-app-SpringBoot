package com.fullstack.todo.todoappfullstack.jwt.resources;
public class AuthenticationException extends RuntimeException {
    public AuthenticationException(String message, Throwable cause) {
        super(message, cause);
    }
}

