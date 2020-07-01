package com.company;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        System.out.println("Введите Ваше число");
        int operand = new Scanner(System.in).nextInt(); //сохраняем число в переменную
        if (0 <= operand && operand < 15) {
            System.out.println("Число " + operand + " находиться в промежутке от 0 до 14");
        }
        else if (operand < 36) {
            System.out.println("Число " + operand + " находиться в промежутке от 15 до 35");
        }
        else if (operand < 50) {
            System.out.println("Число " + operand + " находиться в промежутке от 36 до 50");
        }
        else if (operand == 50) {
            System.out.println("Число " + operand + " находиться в промежутках от 36 до 50 и от 50 до 100");
        }
        else if (operand <= 100) {
            System.out.println("Число " + operand + " находиться в промежутке от 50 до 100");
        }
        else {
            System.out.println("Число " + operand + " не входит не в один из указанных промежутков");
        }
    }
}
