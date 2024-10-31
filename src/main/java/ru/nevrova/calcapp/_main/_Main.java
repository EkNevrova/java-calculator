package ru.nevrova.calcapp._main;

import ru.nevrova.calcapp.service.ResultWriterService;
import ru.nevrova.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        //int resultAdding = Calculator.adding(num1, num2);
        //int resultOperation = Calculator.operation(num1, num2, "+");
        ResultWriterService.resultWriterService(num1, num2, Calculator.operation(num1, num2, "+"), "Операция сложения -");
        ResultWriterService.resultWriterService(num1, num2, Calculator.operation(num1, num2, "-"), "Операция вычитания -");
        ResultWriterService.resultWriterService(num1, num2, Calculator.operation(num1, num2, "*"), "Операция умножения -");

        //int resultSubtraction = Calculator.subtraction(num1, num2);
        //ResultWriterService.resultWriterService(num1, num2, resultSubtraction, "Операция вычитания -");
        //int resultMultiplication = Calculator.multiplication(num1, num2);
        //ResultWriterService.resultWriterService(num1, num2, resultMultiplication, "Операция умножения -");
    }
}
