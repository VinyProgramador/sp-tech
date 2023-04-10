package org.example;
//Nome: Vinicius A Nunes
//RA: 01221125
public class Main {
    public static void main(String[] args) {

        StaticList s1 = new StaticList(5);

        s1.add(1);
        s1.add(6);
        s1.add(7);
        s1.add(3);
        s1.add(6);
        s1.add(9);

        s1.display();

        s1.getElement(2);

        s1.search(3);

        s1.removeByIndex(0);

        s1.removeElement(4);

        s1.display();

        s1.countOccurrences(6);

        s1.replace(3,5);

        s1.addStart(4);

        s1.clean();
    }
}