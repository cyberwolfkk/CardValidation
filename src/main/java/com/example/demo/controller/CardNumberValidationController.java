package com.example.demo.controller;


import com.example.demo.services.ValidationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardNumberValidationController {

    @Autowired
    ValidationService validationService;

    @GetMapping("/validate/{number}")
    public boolean validate(@PathVariable String number){
        return validationService.isValid(number);
    }

}
