package com.company;

public class Bank {
    public static void main(String[] args) {
        calculation(50000, 8.9, 60000);
    }
    public static void calculation (double creditSum, double interestRate, double creditPayment) {
        double creditResult =creditSum + creditSum * interestRate / 100 - creditPayment;
        if (creditResult >= 0 ) {
            System.out.println("Остаток задолжности равен: " + creditResult + "р.");
            System.out.println("Сумма переплат составит " + (creditSum * interestRate / 100) + "р.");
        } else {
            System.out.println("Задолжность по кредиту отсутствует");
        }
    }
}
