package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public class StaticList {
    private final int[] vector;
    private int nroElem;

    public StaticList(int tam) {
        vector = new int[tam];
        nroElem = 0;
    }

    public void add(int elem) {

        if (nroElem == vector.length) {
            System.out.println("Lista cheia");
            return;
        }
        vector[nroElem] = elem;
        nroElem++;
    }

    public void display() {
        for (int i = 0; i < nroElem; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println();
    }

    public int search(int elem) {
        for (int i = 0; i < nroElem; i++) {

            if (vector[i] == elem) {
                return i;
            }
        }
        return -1;
    }

    public boolean removeByIndex(int index) {

        if (index < 0 || index >= nroElem) {
            return false;
        }
        for (int i = index; i < nroElem - 1; i++) {
            vector[i] = vector[i + 1];
        }
        nroElem--;
        return true;
    }

    public boolean removeElement(int elem) {
        int index = search(elem);

        if (index == -1) {
            return false;
        }
        return removeByIndex(index);
    }
}

