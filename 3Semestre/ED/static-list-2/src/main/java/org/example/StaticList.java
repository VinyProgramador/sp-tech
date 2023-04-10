package org.example;

//Nome: Vinicius A Nunes
//RA: 01221125
public class StaticList {
    private int[] vector;
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

    public int search(int element) {
        for (int i = 0; i < nroElem; i++) {
            if (element == vector[i]) return i;
        }
        return -1;
    }

    public int getElement(int index) {
        if (index < 0 || index >= nroElem) {
            return -1;
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
        if (vector.length <= nroElem) {
            return false;
        } else {
            for (int i = vector.length - 1; i > 0; i--) vector[i] = vector[i-1];
            vector[0] = newElement;
            nroElem++;
            return true;
        }
    }

    public boolean replace(int old, int newValue) {
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == old) {
                vector[i] = newValue;
                return true;
            }
        }
        System.out.println("Valor não encontrado.");
        return false;
    }

    public int countOccurrences(int element) {
        int count = 0;
        for (int elementTurn : vector) {
            if (elementTurn == element) {
                count++;
            }
        }
        return count;
    }
    private void order(int index) {
        for (int i = 0; i < nroElem - 1; i++) {
            for (int j = i + 1; j < nroElem; j++) {
                if (index < j) {
                    int aux = vector[j];
                    vector[j] = vector[index];
                    vector[index] = aux;
                    index = j;
                }
            }
        }
    }
}

