package tema8;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
/*
a. retorne true/false según una cadena contenga o no un carácter concreto.
b. retorne la cadena de mayor longitud de dos pasadas como parámetro.
c. retorne el mayor valor de un array pasado como parámetro.
d. retorne la suma de los valores de un array pasado como parámetro.
e. retorne el primer valor en orden ascendente de dos enteros pasados como
parámetro.
f. retorne el primer valor en orden descendente de dos enteros pasados como
parámetro.
 */

interface Itest1 {
    boolean contieneCaracter(String cadena, char caracter);
}
interface Itest2 {
    String cadenaMayor(String cadena1, String cadena2);
        }
interface Itest3 {
    int mayorValor(Integer[] array);
}
interface Itest4 {
    int sumaValores(Integer[] array);
}
interface Itest5 {
    int getValor(int a, int b);
}

public class Ejercicio1 {
    public static void main(String[] args) {
        // a. retorne true/false según una cadena contenga o no un carácter concreto.
        Itest1 f1= (String s, char c) -> s.contains(String.valueOf((c)));
        System.out.println(f1.contieneCaracter("Hola", 'H')); // true

        // b. retorne la cadena de mayor longitud de dos pasadas como parámetro.
        Itest2 f2 = (String s1, String s2) -> {
            return (s1.length() > s2.length() ? s1 : s2);
        };

        // c. retorne el mayor valor de un array pasado como parámetro.

        Itest3 f3 = (Integer[] array) -> {
            Optional<Integer> mayor = Arrays.stream(array).sorted(Comparator.reverseOrder()).findFirst();
            //return Arrays.stream(array).max().orElseThrow();
            return mayor.isEmpty() ? 0 : mayor.get();
        };

        // d. retorne la suma de los valores de un array pasado como parámetro.
        Itest4 f4 = (Integer[] array) -> {
            return Arrays.stream(array).reduce(0, Integer::sum);
        };
        //otra forma
        Itest4 f5 = (Integer[] array) -> {
            return Arrays.stream(array).collect(Collectors.summingInt(Integer::intValue));
        };

        // e. retorne el primer valor en orden ascendente de dos enteros pasados como parámetro.
        Itest5 f6 = (int a, int b) -> {
            return a < b? a:b;
        };

        // f. retorne el primer valor en orden descendente de dos enteros pasados como parámetro.
        Itest5 f7 = (int a, int b) -> {
            return a > b? a:b;
        };
    }


}
