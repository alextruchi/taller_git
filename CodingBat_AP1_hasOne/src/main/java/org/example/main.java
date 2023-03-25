package org.example;

import javax.swing.*;

public class main {
    private static final hasOne hasOne = new hasOne();
    public static void main(String[] args) {
        int seleccion = 0;
        while (seleccion == 0){
            String n = JOptionPane.showInputDialog("Introduce el numero: ");
            boolean resultado = hasOne.hasone(n);
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione opcion",
                    null,
                    JOptionPane.YES_NO_CANCEL_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,    // null para icono por defecto.
                    new Object[] { "continuar", "salir"},   // null para YES, NO y CANCEL
                    "continuar");
        }
    }
}
