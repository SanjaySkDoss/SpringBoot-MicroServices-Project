package org.microservice_1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

public class AuthController {

    @PreAuthorize("hasRole('ADMIN')")
    @RequestMapping(method = RequestMethod.GET , value = "/api/security/admin/")
    public ResponseEntity<String> adminCheck(){
        return new ResponseEntity<>("Hello Admin!!! ", HttpStatus.OK);
    }

    @PreAuthorize("hasRole('USER')")
    @RequestMapping(method = RequestMethod.GET , value = "/api/security/user/")
    public ResponseEntity<String> userCheck(){
        return new ResponseEntity<>("Hello User!!! ", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET , value = "/api/security/")
    @Secured({"ADMIN","USER"})
    public ResponseEntity<String> check(){
        return new ResponseEntity<>("Hello !!! ", HttpStatus.OK);
    }

}
