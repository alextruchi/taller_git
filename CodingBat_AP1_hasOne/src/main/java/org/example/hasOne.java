package org.example;

import javax.swing.*;

public class hasOne {
    public boolean hasone(String n){
        try {
            Integer.valueOf(n);
            if(n.contains("1")) {
                JOptionPane.showMessageDialog(null, "Contiene un numero 1");
                return true;
            }
            else {
                JOptionPane.showMessageDialog(null, "No contiene un numero 1");
                return false;
            }
        }catch (NumberFormatException excepcion){
            JOptionPane.showMessageDialog(null, "No es un numero");
            return false;
        }
    }

}
