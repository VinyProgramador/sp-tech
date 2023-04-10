package org.example;

public class App {
    public static void main(String[] args) {
        ListObj<String> s1 = new ListObj<>(5);
        s1.add("A");
        s1.add("B");
        s1.add("C");
        s1.add("D");
        s1.add("E");
        s1.add("F");

        s1.display();

        s1.getElement(2);

        s1.search(3);

        s1.removeByIndex(0);

        s1.removeElement(4);

        s1.display();

        s1.clean();

    }

}