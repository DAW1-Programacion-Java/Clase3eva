package tema8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
3. Partiendo de una lista como esta List<Integer> numeros =
Arrays.asList(1,17,20,33,19,32,455,23,100); realiza las siguientes operaciones.
a. Mostrar los valores pares de la misma.
b. Mostrar los valores que son, al mismo tiempo, múltiplos de 2 y de 5.
c. Mostrar cada valor de la lista indicando si es primo o no.
d. Obtener una lista con los valores pares de la lista original.
 */
public class Ejercicio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 17, 20, 33, 19, 32, 455, 23, 100);

        // a. Mostrar los valores pares de la misma.
        System.out.println("Valores pares:");
        numeros.stream().filter((n) -> (n % 2 == 0)).forEach(System.out::println);

        // b. Mostrar los valores que son, al mismo tiempo, múltiplos de 2 y de 5.
        System.out.println("Valores múltiplos de 2 y de 5:");
        numeros.stream().filter((n) -> (n % 2 == 0 && n % 5 == 0)).forEach(System.out::println);

        // c. Mostrar cada valor de la lista indicando si es primo o no.
        System.out.println("Valores y si son primos:");
        numeros.forEach((n) ->
        {
            if (esPrimo(n)) {
                System.out.println(n + " es primo");
            }
            else {
                System.out.println(n + " no es primo");
            }});

        // d. Obtener una lista con los valores pares de la lista original.
        List<Integer> listaPares = numeros.stream().
            filter((n) -> (n % 2 == 0)).
            collect(Collectors.toList());


     }

    private static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= numero/2; i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }
}
