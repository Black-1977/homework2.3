package ru.skypro.calculator.exceptions;

public class NeedTwoParamException extends IllegalArgumentException {
    public NeedTwoParamException(String s) {
        super(s);
    }
}
