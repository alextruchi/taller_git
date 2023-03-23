import org.example.hasOne;
import org.junit.jupiter.api.*;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test {
    private final hasOne hasOne = new hasOne();


    @org.junit.jupiter.api.Test
    public void prueba1(){
        int n = Integer.valueOf(JOptionPane.showInputDialog("Introduce el numero: "));
        boolean resultado = hasOne.hasone(n);

        assertEquals(true,resultado, "El numero contiene un 1");

    }
    @org.junit.jupiter.api.Test
    public void prueba2(){
        int n = Integer.valueOf(JOptionPane.showInputDialog("Introduce el numero: "));
        boolean resultado = hasOne.hasone(n);

        assertNotEquals(true,resultado, "El numero No contiene un 1");
    }
}
