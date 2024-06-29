package org.microservice_1.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CartController {

    @RequestMapping(method = RequestMethod.GET , value = "/api/order/")
    public ResponseEntity<String> placeOrder(){
        return new ResponseEntity<>("Redirecting to payment page ", HttpStatus.OK);
    }

}
