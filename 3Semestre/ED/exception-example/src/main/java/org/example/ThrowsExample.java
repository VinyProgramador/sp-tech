package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowsExample {
    public static int divide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        try {
            System.out.println("Enter the first number: ");
            int num1 = in.nextInt();
            System.out.println("Enter the second number: ");
            int num2 = in.nextInt();
            System.out.println(num1 + "/" + num2 + "="+ divide(num1,num2));
        }
        catch (ArithmeticException e){
            System.out.println("Division by zero..");
            e.printStackTrace();
        }
        catch (InputMismatchException e){
            System.out.println("Type only number's");
            e.printStackTrace();
        }
    }
}
