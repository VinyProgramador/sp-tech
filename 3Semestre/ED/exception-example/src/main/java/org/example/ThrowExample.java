package org.example;

import java.util.Scanner;

public class ThrowExample {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Enter the first grade: ");
            Double grade1 = in.nextDouble();
            if (grade1 < 0 || grade1 > 10) {
                throw new LimitOverpassedException("Invalid value in first grade..");
            }
            System.out.println("Enter the second grade: ");
            Double grade2 = in.nextDouble();
            if (grade2 < 0 || grade2 > 10) {
                throw new LimitOverpassedException("Invalid value in first grade");
            }

            System.out.println("Average = " + (grade1 + grade2) / 2);
        } catch (LimitOverpassedException e) {
            System.out.println(e + "-" + e.dateTime);
            e.printStackTrace();
        }
    }
}
