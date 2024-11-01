package ru.nevrova.calcapp.service;

public class ResultWriterService {
    public static void resultWriterService(int num1, int num2, int result, String operationName) {
        System.out.println(operationName + " число X: " + num1 + ", число Y: " + num2 + " = " + result);
    }
}
