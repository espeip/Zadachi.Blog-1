package com.company;

class PowerOfTwo {
    static void stepTwo(int n) {
        if ((n > 0) && ((n & (n - 1)) == 0))
            System.out.println("Число " + n + " является степенью числа 2");
        else
            System.out.println("Число " + n + " не является степенью числа 2");
    }
}
public class Main {

    public static void main(String[] args) {
        PowerOfTwo.stepTwo(253);
    }
}
