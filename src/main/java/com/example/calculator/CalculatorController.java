package com.example.calculator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/{a}/{b}")
    public ResponseEntity<?> division(@PathVariable double a, @PathVariable double b) {
        try {
            Double result = calculatorService.dividir(a, b);
            return ResponseEntity.ok(result);
        } catch (ArithmeticException divisionException) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Error aritmetico: " + divisionException.getMessage());
        }
    }
}
