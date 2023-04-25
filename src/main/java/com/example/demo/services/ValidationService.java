package com.example.demo.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.stream.IntStream;

@Service
@Slf4j
public class ValidationService {

    public boolean isValid(String cardNumber){

        int[] digits = cardNumber.chars().map(Character::getNumericValue).toArray();
        int sum = IntStream.range(0, digits.length)
                .map(i -> i % 2 == digits.length % 2 ? digits[i] * 2 : digits[i])
                .map(n -> n > 9 ? n - 9 : n)
                .sum();

        return sum % 10 == 0;

    }
}
