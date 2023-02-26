package org.example;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

//Nome: Vinicius A Nunes
//RA: 01221125

public class Cart {
    List<Salable> listSaleable;

    public Cart() {
        this.listSaleable = new ArrayList<>();
    }

    public void addSaleable(Salable s) {
        listSaleable.add(s);
    }

    public Double calculateTotalSale() {
        Double totalFinal = 0.0;
        for (int i = 0; i < listSaleable.size(); i++) {
            totalFinal += listSaleable.get(i).getSaleValue();
        }
        return totalFinal;
    }

    public void displayItemsCarts() {
        for (Salable s : listSaleable) {
            System.out.println(s.toString());
        }
    }

}
