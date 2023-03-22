package comprobacionT;

import org.junit.Test;

import static comprobacionT.PassComprobation.NivelSecurity.*;
import static org.junit.Assert.*;

public class PassComprobationTest {


    @Test
    public void DEBIL_MENOR_A_8_CARACTERES() {

        assertEquals(DEBIL,PassComprobation.comprobacion("1234567"));
    }

    @Test
    public void DEBIL_SOLO_LETRAS() {

        assertEquals(DEBIL,PassComprobation.comprobacion( "abcdabfv"));
    }

    @Test
    public void MEDIUM_LETRAS_NUMEROS() {

        assertEquals(MEDIA,PassComprobation.comprobacion("abcd1234"));
    }
    @Test
    public void FUERTE_LETRAS_NUMEROS_SIMBOLOS() {

        assertEquals(FUERTE,PassComprobation.comprobacion("abcd1234!"));
    }
}