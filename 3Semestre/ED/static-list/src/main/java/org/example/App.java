package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public class App {
    public static void main(String[] args) {

    StaticList l1 = new StaticList(5);
    l1.add(10);
    l1.add(3);
    l1.search(2);
    l1.display();
    l1.removeElement(2);
    l1.removeByIndex(0);

    }
}