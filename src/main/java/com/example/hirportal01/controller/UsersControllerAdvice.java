package com.example.hirportal01.controller;


import com.example.hirportal01.exception.InvalidUserException;
import com.example.hirportal01.exception.UserNotFoundException;
import com.example.hirportal01.response.ErrorResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(assignableTypes = UsersController.class)
public class UsersControllerAdvice {

    @ExceptionHandler(value= UserNotFoundException.class)
    public ResponseEntity<Void> handelUserNotFoundException(){
        return ResponseEntity.badRequest().build();
    }

    @ExceptionHandler(value= InvalidUserException.class)
    public ResponseEntity<ErrorResponse> handleInvalidUserException(InvalidUserException exception){
        ErrorResponse errorResponse = new ErrorResponse(exception.getMessages());
        return  ResponseEntity.badRequest().body(errorResponse);
    }
}
