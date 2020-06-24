package com.company;

class DeMorganComparison {
    static boolean deMorgan (boolean a, boolean b) {
        if (!(a | b) == !a & !b)
            return true;
        else
            return false;
    }
}
public class Main {

    public static void main(String[] args) {
	DeMorganComparison.deMorgan(true,true);// write your code here
    }
}
