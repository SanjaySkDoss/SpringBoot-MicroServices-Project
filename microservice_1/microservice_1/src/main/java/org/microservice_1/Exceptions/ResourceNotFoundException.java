package org.microservice_1.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends Exception {

    private String message;
    public ResourceNotFoundException(String message){
        super("From Super class - "+message);
        this.message = message;
    }
}
