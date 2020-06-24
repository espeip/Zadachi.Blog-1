package com.company;

class Parity {
    static void chet1(int i) {
        if (i % 2 == 0 && i != 0)
            System.out.println("Это число четное");
        else if (i % 2 != 0 && i != 0)
            System.out.println("Это число нечетное");
        else
            System.out.println("Ваше число 0");
    }
    static void chet2 (int i) {
        int f = i & 1;
        if (f == 0 && i != 0)
            System.out.println("Это число четное");
        else if (f == 1 && i != 0)
            System.out.println("Это число нечетное");
        else
            System.out.println("Ваше число 0");
    }
}
public class Main {

    public static void main(String[] args) {
        Parity.chet1(12);
	    Parity.chet2(387);// write your code here
    }
}
