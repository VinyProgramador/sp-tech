package org.example;

public class Main {
    public static void main(String[] args) {
        String name1 = "Vinicius";
        String name2 = "Charles";
        int id1 = 10001;
        int id2 = 10002;
        Double grade1 = 10.0;
        Double grade2 = 7.0;

        System.out.println("-----------------------------------\n");
        System.out.printf("%-7s %-14s %7s\n","RA","Name","Grade");
        System.out.printf("%-7d %-14s %7.2f\n",id1,name1,grade1);
        System.out.printf("%-7d %-14s %7.2f\n",id2,name2,grade2);

    }
}