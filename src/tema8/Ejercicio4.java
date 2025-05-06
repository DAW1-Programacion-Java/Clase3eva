package tema8;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/*
Crea una lista de valores Double a partir del método doubles de la clase Random.
Debes crear 10 valores entre 1 y 200.
List<Double> numeros = new Random().doubles(10, 1, 200)
 .boxed().collect(Collectors.toList());
Luego
a. Muestra sólo la parte entera de cada Double (método intValue() de la clase
Double).
b. Muestra la parte decimal de cada Double.
c. Muestra cuántos elementos tiene el stream.
 */
public class Ejercicio4 {
    public static void main(String[] args) {
        List<Double> numeros = new Random().doubles(10, 1, 200)
            .boxed().collect(Collectors.toList());

        // a. Muestra sólo la parte entera de cada Double
        numeros.stream().map(Double::intValue).forEach(System.out::println);

        // b. Muestra la parte decimal de cada Double
        numeros.stream().map(n -> n - Math.floor(n)).forEach(System.out::println);

        // c. Muestra cuántos elementos tiene el stream
        System.out.println("Número de elementos: " + numeros.stream().count());

    }
}
