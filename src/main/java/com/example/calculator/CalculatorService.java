package com.example.calculator;


import org.springframework.stereotype.Service;

@Service
public class CalculatorService {

    private final CalculatorRepository calculatorRepository;

    public CalculatorService(CalculatorRepository calculatorRepository) {
        this.calculatorRepository = calculatorRepository;
    }

    public double dividir(double a, double b) {
        if (b == 0) throw new ArithmeticException("Division by zero");
        return calculatorRepository.division(a, b);
    }
}
