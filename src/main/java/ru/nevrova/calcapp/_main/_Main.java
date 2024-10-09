package ru.nevrova.calcapp._main;

import ru.nevrova.calcapp.service.ResultWriterService;
import ru.nevrova.calcapp.util.Calculator;

import java.util.Scanner;

public class _Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int resultAdding = Calculator.adding(num1, num2);
        ResultWriterService.resultWriterService(num1, num2, resultAdding, "Операция сложения -");

        int resultSubtraction = Calculator.subtraction(num1, num2);
        ResultWriterService.resultWriterService(num1, num2, resultSubtraction, "Операция вычитания -");

        int resultMultiplication = Calculator.multiplication(num1, num2);
        ResultWriterService.resultWriterService(num1, num2, resultMultiplication, "Операция умножения -");
    }
}
