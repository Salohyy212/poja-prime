package com.hei.school.endpoint.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigInteger;
import java.util.Random;

@Controller
public class PrimeController {
    @GetMapping("new-prime")
    public BigInteger generatePrime(){
        BigInteger primeNumber = BigInteger.probablePrime(10000, new Random());
        return primeNumber;
    }
}

