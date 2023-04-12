package org.example;

import javax.swing.*;

public class Division {
    public static void main(String[] args) {
        String number1;
        String number2;
        int num1, num2;
        number1 = JOptionPane.showInputDialog("Enter the first number:");
        number2 = JOptionPane.showInputDialog("Enter the second number:");

        try {
            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);

            JOptionPane.showMessageDialog(null, num1/num2);
        }
        catch (ArithmeticException e){
            JOptionPane.showMessageDialog(null,
                    "Divide by zero\n" + e,
                    "Error",JOptionPane.ERROR_MESSAGE);
        }
        catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,
                    "Type only numbers\n" + e,
                    "Error", JOptionPane.ERROR_MESSAGE);
        }
        System.exit(0);
    }
}
