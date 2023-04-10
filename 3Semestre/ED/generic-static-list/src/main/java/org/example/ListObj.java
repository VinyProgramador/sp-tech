package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public class ListObj<T> {
    private int[] vector;
    private int nroElem;

    public ListObj(int tam) {
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

    public boolean addStart(int newElement) {
        if (array.length <= size) {
            return false;
        } else {
            for (int i = array.length - 1; i > 0; i--) array[i] = array[i-1];
            array[0] = newElement;
            size++;
            return true;
        }
    }

    private void order(int index) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (index < j) {
                    int aux = array[j];
                    array[j] = array[index];
                    array[index] = aux;
                    index = j;
                }
            }
        }
    }
}

