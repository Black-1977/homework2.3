package ru.skypro.calculator.service.impl;

import org.springframework.stereotype.Service;
import ru.skypro.calculator.exceptions.DivideByZeroException;
import ru.skypro.calculator.service.CalculatorService;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int plus(int num1, int num2) {

        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivideByZeroException("Деление на ноль");
        }
        return num1 / num2;
    }
}
