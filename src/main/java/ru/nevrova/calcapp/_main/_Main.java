package ru.nevrova.calcapp._main;

import ru.nevrova.calcapp.service.ResultWriterService;
import ru.nevrova.calcapp.util.Calculator;
import java.util.Scanner;

public class _Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        ResultWriterService.resultWriterService(num1, num2, Calculator.operation(num1, num2, 1), "Операция сложения -");
        ResultWriterService.resultWriterService(num1, num2, Calculator.operation(num1, num2, 2), "Операция вычитания -");
        ResultWriterService.resultWriterService(num1, num2, Calculator.operation(num1, num2, 3), "Операция умножения -");
    }
}
