package com.tpe.hotelmanagementsystem.exception;

public class GuestNotFoundException extends RuntimeException{
    public GuestNotFoundException(String message) {
        super(message);
    }
}