package com.example.calculator;

import org.springframework.stereotype.Repository;

@Repository
public class CalculatorRepository {
    double division(double a, double b) {
        return a / b;
    }
}
