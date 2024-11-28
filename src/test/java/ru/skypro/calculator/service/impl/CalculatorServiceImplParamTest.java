package ru.skypro.calculator.service.impl;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.skypro.calculator.exceptions.DivideByZeroException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorServiceImplParamTest {
    CalculatorServiceImpl service = new CalculatorServiceImpl();

    @ParameterizedTest
    @CsvSource({
            "10, 5", "20, 4", "10, 0"
    })
    void plus(int num1, int num2) {

        int expectedResult = num1 + num2;
        int actualResult = service.plus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5", "20, 4", "10, 0"
    })
    void minus(int num1, int num2) {

        int expectedResult = num1 - num2;
        int actualResult = service.minus(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5", "20, 4", "10, 0"
    })
    void multiply(int num1, int num2) {

        int expectedResult = num1 * num2;
        int actualResult = service.multiply(num1, num2);

        assertEquals(expectedResult, actualResult);
    }

    @ParameterizedTest
    @CsvSource({
            "10, 5", "20, 4", "10, 0"
    })
    void divide(int num1, int num2) {
        if (num2 == 0) {
            boolean exceptionThrown = false;

            try {
                service.divide(num1, num2);
            } catch (DivideByZeroException e) {
                exceptionThrown = true;
            }
            assertTrue(exceptionThrown);
        } else {
            int expectedResult = num1 / num2;
            int actualResult = service.divide(num1, num2);
            assertEquals(expectedResult, actualResult);
        }
    }
}
