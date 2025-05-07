package tema8;

import java.util.Comparator;
import java.util.List;

/*
6. Crea una lista de objetos Jugador. La clase Jugador tiene como atributos nombre,
peso y altura.
a. Muestra las alturas en orden creciente.
b. Muestra los datos de los jugadores en orden creciente por nombre
c. Muestre los datos de los jugadores en orden decreciente por peso
d. Muestre los datos del jugador más pesado
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        List<Jugador> jugadores = List.of(
                new Jugador("Juan", 80, 1.80),
                new Jugador("Pedro", 75, 1.75),
                new Jugador("Luis", 90, 1.85)
        );

        // a. Muestra las alturas en orden creciente.
        System.out.println("Alturas en orden creciente:");
        jugadores.stream().sorted((Jugador j1, Jugador j2) -> {
            if(j1.getAltura() < j2.getAltura()) {
                return -1;
            }
            else if (j1.getAltura() > j2.getAltura()) {
                return 1;
            }
            else {
                return 0;
            }
                })
        .forEach(j -> System.out.println(j.getAltura()));

        System.out.println("---------------------");
        jugadores.stream().sorted((j1, j2) -> Double.compare(j1.getAltura(), (j2.getAltura())))
                .forEach(j -> System.out.println(j.getAltura()));

        System.out.println("---------------------");
        jugadores.stream().
                map(Jugador::getAltura)
                .sorted()
                .forEach(System.out::println);

        // b. Muestra los datos de los jugadores en orden creciente por nombre
        System.out.println("Datos de los jugadores en orden creciente por nombre:");
        jugadores.stream().sorted((j1, j2) -> {
            return j1.getNombre().compareTo(j2.getNombre());
        }).forEach(j -> System.out.println(j.getNombre()));

        // c. Muestre los datos de los jugadores en orden decreciente por peso
        System.out.println("Datos de los jugadores en orden decreciente por peso:");
        jugadores.stream().sorted((j1, j2) -> {
            if(j1.getPeso() < j2.getPeso()) {
                return 1;//cambia el signo para que sea decreciente
            }
            else if (j1.getPeso() > j2.getPeso()) {
                return -1;
            }
            else {
                return 0;
            }
        }).forEach(j -> System.out.println(j.getPeso()));

        System.out.println("---------------------");
        jugadores.stream().sorted((j1, j2) -> Double.compare(j2.getPeso(), j1.getPeso()))
                .forEach(j -> System.out.println(j.getPeso()));

        System.out.println("---------------------");
        jugadores.stream().map(Jugador::getPeso)
                .sorted((Comparator.reverseOrder()))
                .forEach(System.out::println);

        jugadores.stream().sorted(Comparator.comparingDouble(Jugador::getPeso).reversed())
                .forEach(j -> System.out.println(j.getPeso()));

        // d. Muestre los datos del jugador más pesado
        System.out.println("Datos del jugador más pesado:");

        System.out.println(jugadores.stream()
                .max(Comparator.comparingDouble(Jugador::getPeso)));
    }
}
