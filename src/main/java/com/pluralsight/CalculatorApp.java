package com.pluralsight;
import java.util.*;

public class CalculatorApp {
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
// get two numbers, add them together, and display the sum
        System.out.print("Enter first number: ");
        int num1 = myScanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = myScanner.nextInt();
        int sum = num1 + num2;
        System.out.println("The sum is " + sum);
    }
}
