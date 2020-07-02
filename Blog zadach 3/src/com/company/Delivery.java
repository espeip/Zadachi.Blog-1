package com.company;

public class Delivery {
    public static void main(String[] args) {
        System.out.println(countVariant(4));
    }
    public static int countVariant(int n) {
        int sum = 1;
        if (n != 1) {
            sum = n * countVariant(n-1);
        }
        return sum;
    }
}
