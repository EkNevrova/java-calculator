package ru.nevrova.calcapp.util;

public class Calculator {
    public static int operation(int num1, int num2, int operationNumber) {
        int result = 0;
        if (operationNumber == 1) {
            result = num1 + num2;
        } else if (operationNumber == 2) {
            result = num1 - num2;
        } else if (operationNumber == 3) {
            result = num1 * num2;
        }
        return result;
    }
}
