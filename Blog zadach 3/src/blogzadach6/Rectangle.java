package blogzadach6;

import java.util.Scanner;

public class Rectangle {
    static double side1;
    static double side2;
    public static void main(String[] args) {
        System.out.println("Введите переменные:");
        Scanner scan = new Scanner(System.in);
        side1 = scan.nextDouble();
        side2 = scan.nextDouble();
        scan.close();
        System.out.println("Периметр равен: " + perimeterCalculator(side1,side2));
        System.out.println("Площадь равна: " + areaCalculator(side1, side2));

    }
    static double areaCalculator(double side1, double side2) {
        return side1 * side2;
    }
    static double perimeterCalculator(double side1, double side2) {
        return side1 * 2 + side2 * 2;
    }
}
