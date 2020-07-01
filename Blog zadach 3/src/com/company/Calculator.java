package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Введите первое число");
        int operand1 = new Scanner(System.in).nextInt(); //сохраняем первое число
        System.out.println("Введите второе число");
        int operand2 = new Scanner(System.in).nextInt(); // сохраняем второе число
        System.out.println("Введите знак арифметической операции");
        String sing = new Scanner(System.in).next(); // считываем арифметический знак
        /*
        Далее проверка арифметического знака
         */
        switch (sing) {
            case "+":
                int sum = operand1 + operand2;
                System.out.println("Сумма чисел равна: " + sum);
                break;
            case "-":
                int difference = operand1 - operand2;
                System.out.println("Разность чисел равна: " + difference);
                break;
            case "*":
                int composition = operand1 * operand2;
                System.out.println("Произведение чисел равно: " + composition);
                break;
            case "/":
                if (operand2 != 0) {
                    double quotient = (double) operand1 / (double) operand2;
                    System.out.println("Частное чисел равно: " + quotient);
                }
                else {
                    System.out.println("Некорректно заданы числа: деление на 0 невозможно");
                }
                break;
            default:
                System.out.println("Неверно введен арифметический знак");
        }
    }

}
