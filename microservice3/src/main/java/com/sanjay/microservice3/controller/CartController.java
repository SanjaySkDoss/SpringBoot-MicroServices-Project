package com.sanjay.microservice3.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CartController {

    private RestTemplate restTemplate;
    public CartController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

//    @RequestMapping(method = RequestMethod.GET , value = "/api/order/")
//    public ResponseEntity<String> placeOrder(){
//
//        return new ResponseEntity<>("Redirecting to payment page......../n/n "+restTemplate.getForEntity("http://localhost:8082/api/", String.class), HttpStatus.OK);
//    }

    @RequestMapping(method = RequestMethod.GET , value = "/api/s2/")
    public ResponseEntity<String> callM2(){

        return new ResponseEntity<>("Redirecting to Service 2........ "+restTemplate.getForEntity("http://localhost:8082/api/s2/", String.class).getBody(), HttpStatus.OK);
    }

}
