package ru.nevrova.calcapp.util;

public class Calculator {
//    public static int adding ( int x, int y) {
//        return x + y;
//    }
//
//    public static int subtraction ( int x, int y) {
//        return x - y;
//    }
//
//    public static int multiplication ( int x, int y) {
//        return x * y;
//    }
    public static <String> int operation(int num1, int num2, String symbol) {
        int result;
        switch (symbol) {
            case "+":  result = num1 + num2;
                break;
            case  "-": result = num1 - num2;
                break;
            case  "*": result = num1 * num2;
                break;
            default:
                break;
        }
        return result;
    }
}
