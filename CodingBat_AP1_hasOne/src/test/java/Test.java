import org.example.hasOne;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Test {
    private final hasOne hasOne = new hasOne();

    // En la prueba1 solo es para numeros que contegan un 1,
    // ya que este programa es con interfas, por lo que tu digitas el numero
    // si no daria los numeros de forma predeterminada
    @org.junit.jupiter.api.Test
    public void prueba1(){
        String n = JOptionPane.showInputDialog("Introduce el numero: ");
        boolean resultado = hasOne.hasone(n);
        assertEquals(true,resultado, "El numero contiene un 1");
    }
    // En la prueba2 acepta numeros que no contengan un numero 1 o letras,
    // al igual que lo explicado arriba, se hizo asi porque tu digitas la cadena
    @org.junit.jupiter.api.Test
    public void prueba2(){
        String n = JOptionPane.showInputDialog("Introduce el numero: ");
        boolean resultado = hasOne.hasone(n);
        assertNotEquals(true,resultado, "El numero No contiene un 1");
    }
    // prueba general
    @org.junit.jupiter.api.Test
    public void prueba3(){
        assertEquals(true,hasOne.hasone("1233456"), "El numero contiene un 1");
        assertNotEquals(true,hasOne.hasone("2334586"), "El numero NO contiene un 1");
        assertNotEquals(true,hasOne.hasone("HKKN"), "No es un numero");
    }

}
