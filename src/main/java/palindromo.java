import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class palindromo {
    public static void main(String[] args) {
        System.out.println(esPalindromo(ingreseCadena()));
        }
    public static boolean esPalindromo(String cadena){
        cadena.toLowerCase();
        cadena.replace(" ","");
        StringBuilder builder = new StringBuilder(cadena);
        String resultado = builder.reverse().toString();
        return resultado.equals(cadena);
    }
    public static String ingreseCadena(){
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese su palabra o frase: ");
        String palabra = teclado.nextLine();
        return palabra;
    }
}
