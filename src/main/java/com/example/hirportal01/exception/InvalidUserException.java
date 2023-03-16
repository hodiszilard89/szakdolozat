package com.example.hirportal01.exception;

import java.util.List;

public class InvalidUserException  extends RuntimeException{
    private List<String> messages;

    public InvalidUserException(String message, List<String> messages) {
        super(message);
        this.messages = messages;
    }

    public List<String> getMessages() {
        return messages;
    }
}
