import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class palindromo {
    public static void main(String[] args) {
        esPalindromo("oso");
        }
    public static boolean esPalindromo(String cadena){
        cadena.toLowerCase();
        cadena.replace(" ","");
        StringBuilder builder = new StringBuilder(cadena);
        String resultado = builder.reverse().toString();
        return resultado.equals(cadena);
    }
}
