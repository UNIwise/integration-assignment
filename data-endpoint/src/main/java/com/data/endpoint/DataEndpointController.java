package com.data.endpoint;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/data/endpoint")
public class DataEndpointController {

    @RequestMapping(path = "/exam/json/{type}", method = RequestMethod.GET)
    public ResponseEntity<Resource> fetchData(@PathVariable("type") String type) {
        return new ResponseEntity<>(new ClassPathResource(type + ".json"), HttpStatus.OK);
    }
}
