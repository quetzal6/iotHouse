package com.codice.code.iotHouse.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.print.DocFlavor;

@Controller
@RequestMapping(value = "/test")
public class TestController {

    @CrossOrigin
    @RequestMapping(value = "nombre", method = RequestMethod.GET)
    public ResponseEntity<String> testName(){
        ResponseEntity<String> objeto= new ResponseEntity<>("algo", HttpStatus.OK);
        return objeto;
    }
}

