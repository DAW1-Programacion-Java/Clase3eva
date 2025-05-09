package tema8;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

/*
7. Crea una lista de objetos jugadores. La clase Jugador tiene como atributos nombre,
peso y altura..
a. Muestra los nombres de los jugadores en orden ASC
b. Muestra los datos de los jugadores cuyo nombre contiene la “a”
c. Muestra la media de los pesos
d. Mostrar los jugadores con altura superior a la media
 */
public class Ejercicio7 {

    public static void main(String[] args) {
        List<Jugador> jugadores = List.of(
                new Jugador("Juan", 80, 1.80),
                new Jugador("Pedro", 75, 1.75),
                new Jugador("Luis", 90, 1.85),
                new Jugador("Ana", 70, 1.65),
                new Jugador("Maria", 65, 1.60),
                new Jugador("Carlos", 85, 1.90),
                new Jugador("Alberto", 78, 1.82)
        );

        // a. Muestra los nombres de los jugadores en orden ASC
        System.out.println("Nombres de los jugadores en orden ASC:");
        jugadores.stream().map(Jugador::getNombre).sorted().forEach(System.out::println);
        jugadores.stream().sorted((j1, j2) -> j1.getNombre().compareTo(j2.getNombre())).forEach(j -> System.out.println(j.getNombre()));
        jugadores.stream().sorted(Comparator.comparing(Jugador::getNombre)).forEach(j -> System.out.println(j.getNombre()));
        System.out.println("---------------------");
        // b. Muestra los datos de los jugadores cuyo nombre contiene la “a”
        System.out.println("Datos de los jugadores cuyo nombre contiene la 'a':");
        jugadores.stream().filter(j -> j.getNombre().toLowerCase().contains("a")).forEach(System.out::println);
        System.out.println("---------------------");
        // c. Muestra la media de los pesos
        System.out.println("Media de los pesos:");
        System.out.println(jugadores.stream().mapToDouble(Jugador::getPeso).average());

        OptionalDouble media = jugadores.stream().mapToDouble(Jugador::getPeso).average();
        double media2 = jugadores.stream().mapToDouble(Jugador::getPeso).average().orElse(0);
        jugadores.stream().mapToDouble(Jugador::getPeso).average().ifPresent(System.out::println);
        System.out.println("---------------------");
        // d. Mostrar los jugadores con altura superior a la media
        System.out.println("Jugadores con altura superior a la media:");
        jugadores.stream().filter(j -> j.getAltura() > media2).forEach(System.out::println);


    }
}
