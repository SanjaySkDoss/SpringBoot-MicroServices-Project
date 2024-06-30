package com.sanjay.microservice3.service;


import com.sanjay.microservice3.payload.ResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(url = "http://localhost:8082/",value = "Service-2")
public interface APIClient {

    @RequestMapping(method = RequestMethod.GET , value = "/api/s2/")
    ResponseEntity<ResponseDTO> pay();
}
