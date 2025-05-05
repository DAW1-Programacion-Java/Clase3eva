package tema8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class PruebaStream {
    public static void main(String[] args) {
        // Crear un arraylist de números enteros
        List<Integer> numeros = Arrays.asList(10, 13, 16, 20, 33,1, 2, 3, 4, 5);

        // Crear un stream a partir del arraylist
        //Stream s =numeros.stream();
       // Recorrer el stream y mostrar los números
        //s.forEach((n) -> System.out.println(n));
        // Filtrar los números pares y mostrarlos
        //numeros.stream().filter((n)->(n % 2 == 0)).forEach(System.out::println);
        // Ordenar los números de menor a mayor y mostrarlos
        numeros.stream().sorted().forEach(System.out::println);
        // Ordenar los números de mayor a menor y mostrarlos
        numeros.stream().sorted((a,b)->b-a).forEach(System.out::println);
        numeros.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
