package org.microservice_1.exception;

import org.microservice_1.payload.ErrorDetails;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.resource.NoResourceFoundException;

import java.nio.file.AccessDeniedException;


@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = NoResourceFoundException.class)
    public ResponseEntity<ErrorDetails> resourceNotFoundExceptionHandler(WebRequest webRequest){
        return new ResponseEntity<>(new ErrorDetails("Resource Not Found",404), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = ResourceNotFoundException.class)
    public ResponseEntity<ErrorDetails> resourceNotFoundExceptionHandler1(WebRequest webRequest){
        String description = webRequest.getDescription(false);
        return new ResponseEntity<>(new ErrorDetails("User Defined Resource Not Found "+"Web Description: "+description,404), HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(value = AccessDeniedException.class)
    public ResponseEntity<ErrorDetails> accessDeniedExceptionHandler(WebRequest webRequest){
        return new ResponseEntity<>(new ErrorDetails("Incorrect username/password"+ webRequest.toString(),401), HttpStatus.UNAUTHORIZED);
    }
}
