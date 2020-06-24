package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
    Premium personal1 = new Premium("Тарасов Сергей Александрович",12357.18, 12);
    personal1.bonus();
	// write your code here
    }
}
class Premium {
    static String name;
    static double value;
    static int standing;
    Premium (String name, double value, int standing) {
        this.name = name;
        this.value = value;
        this.standing = standing;
    }
    public void bonus () {
        double bonus;
        if (standing < 5)
            bonus = value * 0.1;
        else if (standing < 10)
            bonus = value * 0.15;
        else if (standing < 15)
            bonus = value * 0.25;
        else if (standing < 20)
            bonus = value * 0.35;
        else if (standing < 25)
            bonus = value * 0.45;
        else
            bonus = value * 0.5;
        System.out.println(name + " получит примею в размере " + bonus + " р.");
    }
}
