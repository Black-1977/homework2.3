package ru.skypro.calculator.service.impl;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.skypro.calculator.exceptions.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {

    CalculatorServiceImpl service = new CalculatorServiceImpl();

    @Test
    void plus1() {
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 15;

        int actualResult = service.plus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void plus2() {
        int num1 = 20;
        int num2 = 4;
        int expectedResult = 24;

        int actualResult = service.plus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus1() {
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 5;

        int actualResult = service.minus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void minus2() {
        int num1 = 20;
        int num2 = 4;
        int expectedResult = 16;

        int actualResult = service.minus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply1() {
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 50;

        int actualResult = service.multiply(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void multiply2() {
        int num1 = 20;
        int num2 = 4;
        int expectedResult = 80;

        int actualResult = service.multiply(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide1() {
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 2;

        int actualResult = service.divide(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divide2() {
        int num1 = 20;
        int num2 = 4;
        int expectedResult = 5;

        int actualResult = service.divide(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @Test
    void divideByZero() {
        int num1 = 10;
        int num2 = 0;

        Assertions.assertThrows(DivideByZeroException.class, () -> service.divide(num1, num2));
    }
}
