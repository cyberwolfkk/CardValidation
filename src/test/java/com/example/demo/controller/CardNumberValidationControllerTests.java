package com.example.demo.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class CardNumberValidationControllerTests {

    @Autowired
    MockMvc mockMvc;

    @Test
    public void testValidNumber(){

    }
}
