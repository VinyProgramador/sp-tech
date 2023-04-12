package org.example;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void recordFileCsv(ListObj<Dog> list, String nameFile) {
        FileWriter file = null;
        Formatter exit = null;
        Boolean error = false;

        nameFile+=".csv";

        //block to open the file
        try {
            file = new FileWriter(nameFile);
            exit = new Formatter(file);
        }
        catch (IOException e){
            System.out.println("Error opening file\n");
            System.exit(1);
        }
        //block to create the file
        try {
            for (int i = 0; i < list.getSize(); i++) {
                Dog dog = list.getElement(i);
                exit.format("%d;%s;%s;%.2f\n",
                        dog.getId(),
                        dog.getName(),
                        dog.getPort(),
                        dog.getWeight());
            }
        }
        catch (FormatterClosedException e){
            System.out.println("Error writing file\n");
            error = true;
        }
        finally {
            exit.close();
            try {
                file.close();
            }
            catch (IOException e){
                System.out.println("Error closing file\n");
                error = true;
            }
            if (error){
                System.exit(1);
            }
        }
    }

    public static void readFileCsv(String nameFile){
        FileReader file = null;
        Scanner entry = null;
        Boolean error = false;

        nameFile +=".csv";

        //Bloc try-catch to open file
        try {
            file = new FileReader((nameFile));
            entry = new Scanner(file).useDelimiter(";|\\n");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
            System.exit(1);
        }
        try {
            System.out.printf("%4S %-15S %-9S %4S\n","id","name","port","weight");
            while (entry.hasNext()){
                int id = entry.nextInt();
                String name = entry.next();
                String port = entry.next();
                Double weight = entry.nextDouble();
                System.out.printf("%4d %-15s %-9s %4.1f\n",id,name,port,weight);
            }
        }
        catch (NoSuchElementException e){
            System.out.println("File with problems");
            error = true;
        }
        catch (IllegalStateException e){
            System.out.println("Error reading the file\n");
            error = true;
        }
        finally {
            entry.close();
            try {
                file.close();
            }
            catch (IOException e){
                System.out.println("Error closing file\n");
                error = true;
            }
            if (error){
                System.exit(1);
            }
        }
    }

    public static void main(String[] args) {
            ListObj<Dog> listDog = new ListObj<>(5);

            listDog.add(new Dog(1,"Neguinho 1","Grande",15.0));
            listDog.add(new Dog(2,"Neguinho 2","Pequeno",18.0));
            listDog.add(new Dog(3,"Neguinho 3","Médio",9.0));
            listDog.add(new Dog(4,"Neguinho 4","Pequeno",5.0));
            listDog.add(new Dog(5,"Neguinho 5","Grande",10.0));

            listDog.display();
            recordFileCsv(listDog,"Dogs");
            readFileCsv("Dogs");

    }
}