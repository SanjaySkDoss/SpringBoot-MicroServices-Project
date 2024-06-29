package org.microservice_2.Controllers;

import org.microservice_2.Exceptions.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Payment {

    @RequestMapping(method = RequestMethod.GET , value = "/api/")
    public ResponseEntity<String> pay(){
        return new ResponseEntity<>("Order placed successfullly ", HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET , value = "/")
    public ResponseEntity<String> home() throws ResourceNotFoundException{

        throw new ResourceNotFoundException("Resource Not Found");
        //return new ResponseEntity<>("Order placed successfullly ", HttpStatus.OK);
    }


}
