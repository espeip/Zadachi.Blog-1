package com.company;

import java.util.Scanner;

public class Translator {
    public static void main(String[] args) {
        System.out.println("Введите название дня недели на русском языка " +
                "(для завершения программы введите слово Стоп)");
        String s;
        do {
            String wordForTranslate = new Scanner(System.in).next().toLowerCase();
            // считываем слово с консоли и переводим в нижний регистр
            s = wordForTranslate;
            switch (wordForTranslate) {
                case ("понедельник"):
                    System.out.println("Monday");
                    break;
                case ("вторник"):
                    System.out.println("Tuesday");
                    break;
                case ("среда"):
                    System.out.println("Wednesday");
                    break;
                case ("четверг"):
                    System.out.println("Thursday");
                    break;
                case ("пятница"):
                    System.out.println("Friday");
                    break;
                case ("суббота"):
                    System.out.println("Saturday");
                    break;
                case ("воскресение"):
                    System.out.println("Sunday");
                    break;
                case ("воскресенье"):
                    System.out.println("Sunday");
                    break;
                case ("стоп"):
                    System.out.println("Программа завершена");
                    break;
                default:
                    System.out.println("Некорректно введен день недели");
                    break;
            }
        }
        while (s.equals("стоп") == false);
    }
}
