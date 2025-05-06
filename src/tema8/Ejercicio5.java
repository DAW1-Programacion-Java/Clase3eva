package tema8;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
5. Crea una lista de valores Double a partir del método doubles de la clase Random.
Debes crear 10 valores entre 1 y 200.
Luego muestra los valores de la lista
a. Ordenados de forma ascendente.
b. Ordenados de forma descendente
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        List<Double> numeros = new Random().doubles(10, 1, 200)
            .boxed().collect(Collectors.toList());

        // a. Ordenados de forma ascendente.
        numeros.stream().sorted().forEach(System.out::println);

        // b. Ordenados de forma descendente
        numeros.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        //numeros.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);















        System.out.println("Valores ordenados de forma ascendente:");
        numeros.stream().sorted().forEach(System.out::println);

        // b. Ordenados de forma descendente
        System.out.println("Valores ordenados de forma descendente:");
        numeros.stream().sorted((a, b) -> b.compareTo(a)).forEach(System.out::println);
    }
}
