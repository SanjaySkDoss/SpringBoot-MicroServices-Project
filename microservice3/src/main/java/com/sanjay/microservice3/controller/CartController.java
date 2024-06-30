package com.sanjay.microservice3.controller;

import com.sanjay.microservice3.payload.ResponseDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@RestController
public class CartController {

    private RestTemplate restTemplate;
    private WebClient webClient;
    public CartController(RestTemplate restTemplate,WebClient webClient) {
        this.restTemplate = restTemplate;
        this.webClient = webClient;
    }

//    @RequestMapping(method = RequestMethod.GET , value = "/api/order/")
//    public ResponseEntity<String> placeOrder(){
//
//        return new ResponseEntity<>("Redirecting to payment page......../n/n "+restTemplate.getForEntity("http://localhost:8082/api/", String.class), HttpStatus.OK);
//    }

    @RequestMapping(method = RequestMethod.GET , value = "/api/s2/")
    public ResponseEntity<ResponseDTO> callM2(){
        //ResponseDTO response = restTemplate.getForEntity("http://localhost:8082/api/s2/", ResponseDTO.class).getBody();
        ResponseDTO response = webClient.get().uri("http://localhost:8082/api/s2/").retrieve().bodyToMono(ResponseDTO.class).block();
        return new ResponseEntity<>(new ResponseDTO("Redirecting to Service 2........ "+ response.getMessage()), HttpStatus.OK);
    }

}
