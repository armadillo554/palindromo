import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class palindromoTest {
    @Test
    public void numeroComoString(){
    boolean resultado= palindromo.esPalindromo("2");
    boolean esperado= true;
    assertEquals(esperado,resultado);

    }
}