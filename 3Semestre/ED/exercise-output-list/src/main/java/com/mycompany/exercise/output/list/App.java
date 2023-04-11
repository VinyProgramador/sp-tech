package com.mycompany.exercise.output.list;
import com.mycompany.exercise.output.list.entity.Comic;
import java.util.*;
//Nome: Vinicius A Nunes
//RA:01221125
public class App {
    public static void main(String[] args) {
        ListObj<Comic> comic = new ListObj<>(5);
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Scanner in = new Scanner(System.in);
        Scanner inD = new Scanner(System.in);
        Scanner inB = new Scanner(System.in);
        int numTyped = 0;
        System.out.println("       _                                   _            _                 \n" +
"      (_)                                 (_)          | |                \n" +
"__   ___ _ __  _   _    ___ ___  _ __ ___  _  ___   ___| |__   ___  _ __  \n" +
"\\ \\ / / | '_ \\| | | |  / __/ _ \\| '_ ` _ \\| |/ __| / __| '_ \\ / _ \\| '_ \\ \n" +
" \\ V /| | | | | |_| | | (_| (_) | | | | | | | (__  \\__ \\ | | | (_) | |_) |\n" +
"  \\_/ |_|_| |_|\\__, |  \\___\\___/|_| |_| |_|_|\\___| |___/_| |_|\\___/| .__/ \n" +
"                __/ |                                              | |    \n" +
"               |___/                                               |_|    \n" +
"                                                                          ");
    
        System.out.println("Welcome to Viny Comic Shop!\n");
        do {            
            System.out.println("Choose the desired option:");
            System.out.println("1 - Add a new product");
            System.out.println("2 - Show report");
            System.out.println("3 - Out");
            
            numTyped = sc.nextInt();
            
            switch(numTyped){
                case 1:
                    System.out.println("Enter the id:");
                    Integer id = in.nextInt();
                    System.out.println("Enter the price:");
                    Double price = inD.nextDouble();
                    System.out.println("Enter the name:");
                    String name = sc.next();
                    System.out.println("who is the writer?");
                    String writer = sc2.next();
                    System.out.println("Enter the distributor:");
                    String distributor = sc.next();
                    System.out.println("Enter the amount of sales:");
                    Integer soldAmount = in.nextInt();
                    System.out.println("Is GraphiNovel?");
                    boolean isGraphiNovel = inB.nextBoolean();
                    comic.add(new Comic(id, soldAmount, name, price, writer, isGraphiNovel, distributor));
                    System.out.println("Registering...\n\n");
                    break;
                case 2:
                    System.out.println("thats is report..\n\n");
                    System.out.printf("%10s | %10s | %-10s | %-10s | %-10s | %-10s | %-10s\n",
                                    "ID", "Sold Amount", "Name", "Price", "Writer", "Is GraphiNovel", "Distributor");
                                      
                    for (int i = 0; i < comic.getSize(); i++) {
                        Comic comicTurn = comic.getElement(i);
                        System.out.printf("%010d | %010d | %-10s | %8.2f | %-20s | %b | %-20s\n",
                                comicTurn.getId(),
                                comicTurn.getSoldAmount(),
                                comicTurn.getName(),
                                comicTurn.getPrice(),
                                comicTurn.getWriter(),
                                comicTurn.isIsGraphiNovel(),
                                comicTurn.getDistributor()
                        );
                    }
                    break;
                case 3:
                    System.out.println("leaving..");
                    break;
                    default:
                    System.out.println("Invalid option..");
            }
        } while (numTyped!=3);
    
    }
    
    
}
