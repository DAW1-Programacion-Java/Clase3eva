package tema8;

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
        jugadores.stream().sorted((Jugador j1, Jugador j2) -> (int) (j1.getAltura() - (j2.getAltura())))
                .forEach(j -> System.out.println(j.getAltura()));
        System.out.println("---------------------");
        jugadores.stream().sorted((j1, j2) -> Double.compare(j1.getAltura(), (j2.getAltura())))
                .forEach(j -> System.out.println(j.getAltura()));

    }
}
