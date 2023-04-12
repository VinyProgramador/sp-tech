package org.example;

public class ListObj<T> {
    private T[] vector;
    private int nroElem;

    public ListObj(int tam) {
        vector = (T[]) new Object[tam];
        nroElem = 0;
    }

    public void add(T elem) {

        if (nroElem == vector.length) {
            System.out.println("Full list");
            return;
        }
        vector[nroElem] = elem;
        nroElem++;
    }

    public void display() {
        for (int i = 0; i < nroElem; i++) {
            System.out.print(vector[i] + " \n");
        }
        System.out.println();
    }

    public int search(int elem) {
        for (int i = 0; i < nroElem; i++) {

            if (vector[i].equals(elem)) {
                return i;
            }
        }
        return -1;
    }

    public T getElement(int index) {
        if (index < 0 || index >= nroElem) {
            return null;
        }
        return vector[index];
    }

    public int getSize() {
        return nroElem;
    }

    public boolean removeByIndex(int index) {
        if (index < 0 || index >= vector.length) {
            return false;
        } else {
            for (int i = index; i < nroElem - 1; i++) {
                vector[i] = vector[i + 1];
            }
            nroElem--;
            return true;
        }
    }

    public boolean removeElement(int elem) {

        if (search(elem) == -1) {
            return false;
        }
        return removeByIndex(search(elem));
    }

    public void clean() {
        nroElem = 0;
    }
}
