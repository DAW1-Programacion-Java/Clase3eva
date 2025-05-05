package tema8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
Partiendo de una lista como esta List<Integer> numeros =
        Arrays.asList(1,10,20,33,34,32,455,20,100); realiza las siguientes operaciones.
a. Mostrar sólo los pares.
b. Mostrar true/false si son todos positivos. Usar allMatch(filtro).
c. Obtener el menor.
d. Obtener la suma de todos los valores.

 */
public class Ejercicio2 {
    static List<Integer> numeros = Arrays.asList(1,10,20,33,34,32,455,20,100);
    public static void main(String[] args) {
        Ejercicio2 e = new Ejercicio2();
        //a. Mostrar sólo los pares.
        numeros.stream().filter((n)->(n % 2 == 0)).forEach(System.out::println);

        //b. Mostrar true/false si son todos positivos. Usar allMatch(filtro).
        numeros.stream().allMatch((n)->(n>0));

        //c. Obtener el menor.
        numeros.stream().min(Integer::compareTo);
        numeros.stream().sorted().findFirst();

        //d. Obtener la suma de todos los valores.
        numeros.stream().reduce(0, Integer::sum);
        numeros.stream().reduce(0, (a,b)->a+b);
        numeros.stream().collect(Collectors.summingInt(Integer::intValue));

















        e.numeros.stream().filter((n)->(n % 2 == 0)).forEach(System.out::println);
        //b. Mostrar true/false si son todos positivos. Usar allMatch(filtro).
        System.out.println(e.numeros.stream().allMatch((n)->(n>0)));
        //c. Obtener el menor.
        System.out.println(e.numeros.stream().min(Integer::compareTo));
        //d. Obtener la suma de todos los valores.
        System.out.println(e.numeros.stream().reduce(0, Integer::sum));
    }
}
