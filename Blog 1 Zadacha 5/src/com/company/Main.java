package com.company;

class LogicOperations {
    static void logicOperations() {
        int x = 5;
        int y = 10;
        int z = 15;
        int one = x += y >> x++ * z;
        System.out.println(one);
        int two = z = ++x & y * 5;
        System.out.println(two);
        int three = y /= x + 5 | z;
        System.out.println(three);
        int four = z = x++ & y * 5;
        System.out.println(four);
        int five = x = y << x++ ^ z;
        System.out.println(five);
    }
}
public class Main {

    public static void main(String[] args) {
        LogicOperations.logicOperations();
    }
}

