package com.pluralsight;

public class Demo8params {


    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        int c = 10;
        int d = 3;

        addAndDisplay(a, b);
        addAndDisplay(b, c);
        addAndDisplay(a, d);

    }

    public static void addAndDisplay(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + sum);
    }

}
