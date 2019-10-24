package com.poc.poc.controller;

import com.poc.poc.annotation.CustomAnnotation;
import com.poc.poc.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private TestService testService;

    @CustomAnnotation
    @GetMapping("/test")
    public ResponseEntity<String> test(){
        testService.testMethod();
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
